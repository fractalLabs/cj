(ns cj.core
  (:use
    [clojure.contrib.shell :only [sh]]
    [clojure.template :only [do-template]]))


;se puede agregar a sh:  :return-map true
(defn sh-c
  "Function to pass string as full command to make shell command easier"
  [#^String command]
  (sh "/bin/sh" "-c" command))

(defn sh-l [#^String command]
   (re-seq #"[^\n]+" (sh-c command)))

(defn sh-a [cmd args] (sh-l (apply str (interpose " " (cons cmd args)))))


(defn key2str [k] (apply str (rest (str k))))

(defn key2arg [k] (str "-" (key2str k)))

(defn keys2args [l] (map #(if (keyword? %) (key2arg %) %) l))

(do-template
  [cmd]
  (defn cmd [& args] (sh-a (quote cmd) (keys2args args)))
  
apt-get
aptitude
aspell
awk
basename
bc
bg
break
builtin
bzip2
cal
cat
cd
cfdisk
chgrp
chmod
chown
chroot
chkconfig
cksum
cmp
comm
command
continue
cp
cron
crontab
csplit
curl
cut
date
dc
dd
ddrescue
;declare
df
diff
diff3
dig
;dir
dircolors
dirname
dirs
dmesg
du
echo
egrep
eject
enable
env
;eval
exec
exit
expect
expand
export
expr
fdformat
fdisk
fg
fgrep
;find
fmt
fold
fsck
function
fuser
gawk
getopts
sgit
grep
groups
gzip
;hash
head
history
hostname
iconv
id
ifconfig
ifdown
ifup
;import
install
jobs
join
kill
killall
;let
ln
local
locate
logname
logout
look
lpc
lpr
lprm
ls
lsof
man
mkdir
mkfifo
mknod
mount
mtools
mtr
mv
mmv
nice
nl
nohup
notify-send
nslookup
open
op
passwd
paste
ping
pkill
popd
;pr
;printf
ps
pushd
pwd
quota
quotacheck
quotactl
ram
rcp
;read
readonly
rename
return
rev
rm
rmdir
rsync
screen
scp
sdiff
sed
select
;seq
;set
shift
shopt
shutdown
sleep
slocate
;sort
;source
split
ssh
su
sudo
sum
suspend
symlink
;sync
tail
tar
tee
;test
;time
times
touch
top
traceroute
tr
tsort
tty
;type
ulimit
umask
unalias
uname
unexpand
uniq
units
unset
unshar
until
useradd
usermod
users
uuencode
uudecode
vmstat
watch
wc
whereis
which
;while
who
whoami
write
xargs
xdg-open
yes
!!
  )