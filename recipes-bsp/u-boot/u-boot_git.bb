FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require u-boot-common_${PV}.inc
require u-boot.inc

DEPENDS += "bc-native dtc-native"

SRC_URI += "file://0001-imx-Add-MYiR-Tech-MYS-6ULX-support.patch"
