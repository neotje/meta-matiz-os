SUMMARY = "Matiz os image base"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

# Change root password
EXTRA_USERS_PARAMS = "\
  usermod -P 'toor' root \
  "