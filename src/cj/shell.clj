(ns cj.shell
  (:use
    [clojure.contrib.shell :only [sh]]
    [clojure.template :only [do-template]]))


;se puede agregar a sh:  :return-map true y meterlo como metadata
;does this really have to be here?
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
df
diff
diff3
dig
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
fmt
fold
fsck
function
fuser
gawk
getopts
git
grep
groups
gzip
head
history
hostname
iconv
id
ifconfig
ifdown
ifup
install
jobs
join
kill
killall
lein
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
ps
pushd
pwd
quota
quotacheck
quotactl
ram
rcp
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
shift
shopt
shutdown
sleep
slocate
split
ssh
su
sudo
sum
suspend
symlink
tail
tar
tee
times
touch
top
traceroute
tr
tsort
tty
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
wget
whereis
which
who
whoami
write
xargs
xdg-open
yes
!!
  )