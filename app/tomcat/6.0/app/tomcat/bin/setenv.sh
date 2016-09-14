export CATALINA_OPTS="$CATALINA_OPTS -Xms2048m -Xmx2048m -XX:PermSize=128M -XX:MaxPermSize=256m -Duser.timezone=Asia/Shanghai" 

export JAVA_HOME=/app/jdk
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar


export CATALINA_OPTS="$CATALINA_OPTS -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -XX:+HeapDumpOnOutOfMemoryError"

export CATALINA_OPTS="$CATALINA_OPTS -Djava.rmi.server.hostname=localhost"

export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.port=8401"

export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.authenticate=false"

export CATALINA_OPTS="$CATALINA_OPTS -Dcom.sun.management.jmxremote.ssl=false"
