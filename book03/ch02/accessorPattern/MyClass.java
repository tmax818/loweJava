package book03.ch02.accessorPattern;

/**
 * Why not just make 
 */
public class MyClass {

    /**
     * Why not just make these public?
     * You could, if you want to disregard the well-established and generally accepted Accessor pattern. But do so at your peril. Following the Accessor pattern helps you thing about whether all fields need readers and writers and helps protect the class form implementation changes.
     */
    private int fieldX;
    private int fieldY;


    public int getFieldX() {
        return this.fieldX;
    }

    public void setFieldX(int fieldX) {
        this.fieldX = fieldX;
    }

    public int getFieldY() {
        return this.fieldY;
    }

    public void setFieldY(int fieldY) {
        this.fieldY = fieldY;
    }

    
}
