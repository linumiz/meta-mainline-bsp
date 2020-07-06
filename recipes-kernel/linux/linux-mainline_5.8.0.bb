FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require linux.inc

KBRANCH = "master"
LINUX_KERNEL_TYPE = "mainline"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;branch=${KBRANCH} \
	    file://0001-dt-bindings-arm-fsl-Add-MYiR-Tech-boards.patch \
	    file://0002-ARM-dts-imx6ull-add-MYiR-MYS-6ULX-SBC.patch \
	"

KBUILD_DEFCONFIG_mys-6ulx-sbc = "imx_v6_v7_defconfig"
SRCREV = "35e884f89df4c48566d745dc5a97a0d058d04263"
PV = "5.8.0-rc3"
