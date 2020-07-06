DESCRIPTION = "MYS SD image"

inherit core-image

export IMAGE_BASENAME = "mys-image-base-sd"
IMAGE_FSTYPES = "wic.xz"
DEPENDS += "mys-image-base"
do_image_wic[depends] += "mys-image-base:do_image_complete"
WKS_FILES = "sd.wks"
