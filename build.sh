export PATH=$PWD/../bitbake/bin:$PATH
export BBPATH=$PWD:$PWD/toolchain

#bitbake -D -D -D -v virtual/libc
bitbake -v virtual/libc 
#qt4-embedded