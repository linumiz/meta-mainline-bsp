FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require linux.inc

KBRANCH = "master"
LINUX_KERNEL_TYPE = "mainline"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;branch=${KBRANCH} \
	   file://defconfig \
	"

SRCREV = "${AUTOREV}"
KERNEL_VERSION_SANITY_SKIP="1"
