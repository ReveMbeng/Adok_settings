#!/system/bin/

#Export pin 19  et 28
echo 28 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio28/direction

echo 19 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio19/direction

#export pin 21
echo 21 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio21/direction
#export pin 18
echo 18 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio18/direction
#export pin 24
echo 24 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio24/direction
#export pin 209
echo 209 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio209/direction
#export pin 31
echo 31 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio31/direction

