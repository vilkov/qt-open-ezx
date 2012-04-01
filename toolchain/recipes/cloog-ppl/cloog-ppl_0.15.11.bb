require cloog-ppl.inc
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c0c8c39efe4b616cc7187df2883ef4a"
DEPENDS += "gmp ppl"

SRC_URI = "ftp://gcc.gnu.org/pub/gcc/infrastructure/cloog-ppl-${PV}.tar.gz"
SRC_URI[md5sum] = "060ae4df6fb8176e021b4d033a6c0b9e"
SRC_URI[sha256sum] = "7cd634d0b2b401b04096b545915ac67f883556e9a524e8e803a6bf6217a84d5f"

EXTRA_OECONF += "--with-ppl"

S = "${WORKDIR}/cloog-ppl-${PV}"

BBCLASSEXTEND = "native nativesdk"
