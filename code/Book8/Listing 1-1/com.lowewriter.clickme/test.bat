javac module-info.java com\lowewriter\ClickMe\*.java --module-path "c:\javafx-sdk-18.0.2\lib" --add-modules javafx.controls

jar cmvf ClickMe.mf com.lowewriter.ClickMe.jar *.class com\lowewriter\ClickMe\*.class

java --module-path c:\javafx-sdk-18.0.2\lib --add-modules javafx.controls com.lowewriter.clickme.ClickMe

pause
