$JAVA_HOME/bin/jstack `ps -ef | grep Xmx | grep -v grep | awk '{print $2}'`