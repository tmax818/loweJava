set class=ClickMe
set package=com.lowewriter.clickme
javac module-info.java com\lowewriter\%class%\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls
jar cmvf %class%.mf %package%.jar *.class com\lowewriter\%class%\*.class
java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls %package%.%class%
pause

