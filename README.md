# wfelytron

Sample application which deploys rest service to custom Elytron security domain.
Tested on Wildfly 33.0.2.final
The elytron-war is unused.

## Pre:
Java 17
Maven 3.9.9

## How to:
1. Run: **mvn clean package** on main pom.xml
2. Copy configuration files from wf-config into standalone configuration folder
3. Run wildfly: standalone.bat -c standalone-full.xml or Run standalone.sh -c standalone-full.xml
5. Deploy project to http://localhost:9990/console/index.html or use jboss-cli
6. Test with following command: **curl -k --user usr:usr -XGET "http://localhost:8080/rest/rst/test"**