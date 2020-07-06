# meta-linumiz-bsp

### Compiling the yocto image

Dependent layer can be added to bblayer.conf and reference image can be build for
- MACHINE: mys-6ulx-sbc
- Image name: bitbake mys-image-base-sd

The resultant will create wic image (with kernel fitImage and basic functional root filesystem).
Build also produces the SPL and u-boot image, which needs to be loaded manually for the first
time using SDP.
