SUMMARY = "M-bus Library from Raditex Control"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "git://github.com/ipeperko/libmbus;protocol=https \
    file://CMakeLists.txt \
    file://config.h \
    "
SRCREV = "2dc3daaf7080cb77640e6caee3154585b8196a37"

PR = "r1"
PV = "0.1+git${SRCPV}"

inherit pkgconfig cmake

S = "${WORKDIR}/git"

do_configure_prepend() {
    install ${WORKDIR}/CMakeLists.txt ${S}
    install ${WORKDIR}/config.h ${S}
}
