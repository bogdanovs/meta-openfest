DESCRIPTION = "Hello World"
HOMEPAGE = "https://github.com/leon-anavi/hello-world"
SECTION = "hello"
LICENSE = "MIT"
PR = "r1"

PRIORITY = "10"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/leon-anavi/hello-world.git;branch=master;tag=f66f58e7bcdcc834568d8c7c6fc51e30765befad"

S = "${WORKDIR}/git"

inherit autotools
