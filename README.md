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






javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test1tidyISBN10or13InsertingDashesTrue10.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test1tidyISBN10or13InsertingDashesTrue10

java -jar lib/jacococli.jar report test1tidyISBN10or13InsertingDashesTrue10.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test1tidyISBN10or13InsertingDashesTrue10





javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test2tidyISBN10or13InsertingDashesTrue13.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test2tidyISBN10or13InsertingDashesTrue13

java -jar lib/jacococli.jar report test2tidyISBN10or13InsertingDashesTrue13.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test2tidyISBN10or13InsertingDashesTrue13





javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test3TidyInsert_null.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test3TidyInsert_null

java -jar lib/jacococli.jar report test3TidyInsert_null.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test3TidyInsert_null




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test4TidyInsert_empty.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test4TidyInsert_empty

java -jar lib/jacococli.jar report test4TidyInsert_empty.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test4TidyInsert_empty





javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test5TidyInsert_tooLong.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test5TidyInsert_tooLong

java -jar lib/jacococli.jar report test5TidyInsert_tooLong.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test5TidyInsert_tooLong




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test6TidyInsert_isbn10.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test6TidyInsert_isbn10

java -jar lib/jacococli.jar report test6TidyInsert_isbn10.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test6TidyInsert_isbn10




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test8TidyRemove_null.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test8TidyRemove_null

java -jar lib/jacococli.jar report test8TidyRemove_null.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test8TidyRemove_null




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test9TidyRemove_empty.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test9TidyRemove_empty

java -jar lib/jacococli.jar report test9TidyRemove_empty.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test9TidyRemove_empty




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test10TidyRemove_tooLong.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test10TidyRemove_tooLong

java -jar lib/jacococli.jar report test10TidyRemove_tooLong.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test10TidyRemove_tooLong




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test11TidyRemove_isbn10.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test11TidyRemove_isbn10

java -jar lib/jacococli.jar report test11TidyRemove_isbn10.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test11TidyRemove_isbn10




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test12TidyRemove_isbn13.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test12TidyRemove_isbn13

java -jar lib/jacococli.jar report test12TidyRemove_isbn13.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test12TidyRemove_isbn13




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test13Isbn10To13_invalidLength.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test13Isbn10To13_invalidLength

java -jar lib/jacococli.jar report test13Isbn10To13_invalidLength.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test13Isbn10To13_invalidLength




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test14Isbn10To13_valid.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test14Isbn10To13_valid

java -jar lib/jacococli.jar report test14Isbn10To13_valid.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test14Isbn10To13_valid




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test15Isbn13To10_invalidLength.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test15Isbn13To10_invalidLength

java -jar lib/jacococli.jar report test15Isbn13To10_invalidLength.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test15Isbn13To10_invalidLength




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test16Isbn13To10_valid978.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test16Isbn13To10_valid978

java -jar lib/jacococli.jar report test16Isbn13To10_valid978.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test16Isbn13To10_valid978




javac -d classes -cp "lib/*" ISBNValidate.java ISBNValidateTest.java

java -javaagent:lib/jacocoagent.jar=destfile=test17Isbn13To10_not978.exec \
-jar lib/junit-platform-console-standalone-1.10.0.jar \
--class-path classes \
--select-method ISBNValidateTest#test17Isbn13To10_not978

java -jar lib/jacococli.jar report test17Isbn13To10_not978.exec \
--classfiles classes \
--sourcefiles . \
--html rapport-test17Isbn13To10_not978