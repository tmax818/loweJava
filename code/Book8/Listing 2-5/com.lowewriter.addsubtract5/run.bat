set class=AddSubtract5
set package=com.lowewriter.addsubtract5
javac module-info.java com\lowewriter\addsubtract5\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls
jar cmvf %class%.mf %package%.jar *.class com\lowewriter\addsubtract5\*.class
java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls %package%.%class%
pause

