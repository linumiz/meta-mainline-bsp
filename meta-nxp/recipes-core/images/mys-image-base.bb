SUMMARY = "Base image for MYiR Tech distribution"
HOMEPAGE = "http://www.myirtech.com/"
LICENSE = "MIT"
inherit core-image

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us"

IMAGE_INSTALL = "\
	packagegroup-core-boot \
	kernel-modules \
"
