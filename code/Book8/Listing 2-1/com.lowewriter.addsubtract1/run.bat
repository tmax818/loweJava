set class=AddSubtract
set package=com.lowewriter.addsubtract1
javac module-info.java com\lowewriter\addsubtract1\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls
jar cmvf %class%.mf %package%.jar *.class com\lowewriter\addsubtract1\*.class
java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls %package%.%class%
pause

