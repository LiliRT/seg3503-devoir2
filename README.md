dans validator

javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java


java -javaagent:lib/jacocoagent.jar=destfile=jacoco.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-class ISBNValidateTest


java -jar lib/jacococli.jar report jacoco.exec \
--classfiles classes \
--sourcefiles . \
--html rapport
