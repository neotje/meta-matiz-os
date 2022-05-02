LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://download2.gluonhq.com/openjfx/18.0.1/openjfx-18.0.1_linux-aarch64_bin-sdk.zip"
SRC_URI[md5sum] = "9593196c79c1782bad1c54316cb3d9d7"
SRC_URI[sha1sum] = "4817e4ecdc88948e0d91a88e7dabde02ae377563"
SRC_URI[sha256sum] = "071827b9944fc91ac5ffc5bfd245cca56b4eeca539a154c4aa85338492883e7b"
SRC_URI[sha384sum] = "71fbd3f2aded35ff4d05c20f6bc4dc302a98ad34ad96a1fcf4f1a89e19a188e006ed13bdea405d41d14ee715d97a266c"
SRC_URI[sha512sum] = "b2683a005d2ed63ac8f11aeaccf50ff9a95d1e0f88f9cb3d06d6a54f7dcc591e145bab1d00a00c132e16a272179d48501f537ed4ae612aa4af86e0c8fb73ccb1"

S = "${WORKDIR}/${BPN}-sdk-18.0.1"

inherit allarch

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_install () {
   install -d ${D}${libdir}
	cp -r ${S} ${D}${libdir}
}

