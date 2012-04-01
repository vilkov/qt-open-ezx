require ppl.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gmp"
SRC_URI = "ftp://ftp.cs.unipr.it/pub/ppl/releases/${PV}/ppl-${PV}.tar.bz2 \
	   file://ppl_autoreconf.patch \
	  "
SRC_URI[md5sum] = "c24429e6c3bc97d45976a63f40f489a1"
SRC_URI[sha256sum] = "e3fbd1c19ef44c6f020951807cdb6fc6a8153cd3a5c53b0ab9cf4c4f6e8cbbeb"

S = "${WORKDIR}/ppl-${PV}"
BBCLASSEXTEND = "native nativesdk"

EXTRA_OECONF = "--enable-watchdog --disable-debugging --disable-assertions --disable-ppl_lcdd --disable-ppl_lpsol --disable-ppl_pips --enable-interfaces='c cxx'"

acpaths = "-I m4"
