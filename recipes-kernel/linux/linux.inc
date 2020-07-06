SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

inherit kernel
inherit kernel-yocto 
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_append := "${THISDIR}/${PN}-${PV}:"

S = "${WORKDIR}/git"

# Exclude this from generation of mirror tarballs
BB_GENERATE_MIRROR_TARBALLS = "0"
# Make sure to fetch from BitBucket by allowing network access and clearing premirrors
BB_FETCH_PREMIRRORONLY = "0"
PREMIRRORS = ""
