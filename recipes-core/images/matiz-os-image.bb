SUMMARY = "Matiz os image base"

IMAGE_FEATURES += "splash package-management x11-base"

LICENSE = "MIT"

inherit core-image
inherit features_check
inherit extrausers

# required
REQUIRED_DISTRO_FEATURES = "x11"

# Set rootfs to 200 MiB
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "2048000"
#IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

# Change root password
EXTRA_USERS_PARAMS = "\
  usermod -P 'toor' root \
  "

# opengl memory
QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'