set class=AddSubtract4
set package=com.lowewriter.addsubtract4
javac module-info.java com\lowewriter\addsubtract4\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls
jar cmvf %class%.mf %package%.jar *.class com\lowewriter\addsubtract4\*.class
java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls %package%.%class%
pause

