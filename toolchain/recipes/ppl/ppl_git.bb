require ppl.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gmp"
#SRCREV = "0ae35bbbc1e8f4d1a38ced7fe7190be9a29e4fb6"
SRC_URI = "ftp://ftp.cs.unipr.it/pub/ppl/releases/${PV}/ppl-${PV}.tar.bz2"
#SRC_URI = "git://git.cs.unipr.it/ppl/ppl.git;branch=master;protocol=git"
SRC_URI[md5sum] = "c24429e6c3bc97d45976a63f40f489a1"
SRC_URI[sha256sum] = "e3fbd1c19ef44c6f020951807cdb6fc6a8153cd3a5c53b0ab9cf4c4f6e8cbbeb"

S = "${WORKDIR}/ppl-${PV}"
# S = ${WORKDIR}/git
BBCLASSEXTEND = "native nativesdk"

EXTRA_OECONF = "--enable-cxx=g++"

DEFAULT_PREFERENCE = "-1"
