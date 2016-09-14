if [ -f /app/logs$MARATHON_APP_ID-$HOSTNAME-`date "+%Y%m%d"`.log ] ; then
tail -n 1000 /app/logs$MARATHON_APP_ID-$HOSTNAME-`date "+%Y%m%d"`.log
elif [ -f /app/logs$MARATHON_APP_ID-$HOSTNAME-`date "+%Y%m%d"`.out ] ; then
tail -n 1000 /app/logs$MARATHON_APP_ID-$HOSTNAME-`date "+%Y%m%d"`.out
else
echo "there is no available logs "
fi
