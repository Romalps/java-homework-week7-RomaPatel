package homeworkprogram;

/*  15. Wall Area
        Write a class with the name Wall. The class needs two fields (instance variables) with name width
        and height of type double.
        The class needs to have two constructors. The first constructor does not have any parameters (no-arg
        constructor). The second constructor has parameters width and height of type 'double' and it needs to
        initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
        height parameter is less than 0 it needs to set the height field value to 0.
        Write the following methods (instance methods):
        * Method named getWidth without any parameters, it needs to return the value of width field.
        * Method named getHeight without any parameters, it needs to return the value of height field.
        * Method named setWidth with one parameter of type double, it needs to set the value of the width
        field. If the parameter is less than 0 it needs to set the width field value to 0.
        * Method named setHeight with one parameter of type double, it needs to set the value of the
        height field. If the parameter is less than 0 it needs to set the height field value to 0.
        * Method named getArea without any parameters, it needs to return the area of the wall.
        TEST EXAMPLE
        → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        → OUTPUT:
        area= 20.0
        width= 5.0
        height= 0.0
        area= 0.0
        NOTE: All methods should be defined as public NOT public static.
        NOTE: In total, you have to write 5 methods and 2 constructors
 */
public class Wall15 {
    //Instance variable
    double width;
    double height;

    public Wall15() {// constructor without any arguments

        System.out.println("no argument constructor");
        this.width = 0;
        this.height = 0;
    }

    public Wall15(double width, double height) {// constructors with 2 arguments


        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getWidth() {// instance method
        return this.width;
    }

    public double getHeight() {//instance method
        return this.height;
    }

    public void setWidth(double width) {//instance method
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {//instance method
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {//instance method
        return (this.width * this.height);
    }

    public static void main(String[] args) {//main method
        Wall15 wall = new Wall15(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
