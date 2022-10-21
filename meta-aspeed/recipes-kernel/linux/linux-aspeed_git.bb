KBRANCH ?= "dev-6.0"
LINUX_VERSION ?= "6.0.2"

SRCREV="b380fe3037afd47726ab84684df5ee620793bb25"

require linux-aspeed.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-dts-ast2600-evb-Enable-uart3-and-disable-mac4.patch \
"
