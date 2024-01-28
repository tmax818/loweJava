set class=AddSubtract2
set package=com.lowewriter.addsubtract2
javac module-info.java com\lowewriter\addsubtract2\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls
jar cmvf %class%.mf %package%.jar *.class com\lowewriter\addsubtract2\*.class
java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls %package%.%class%
pause

