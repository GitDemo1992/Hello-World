package Class_Rectangle;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width){
        //this.height = height;
        //this.width = width;
        setHeight(height);
        setWidth(width);
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getRectangleArea(){
        //System.out.println("Area of Rectangle is " + (height * width));
        return height * width;
    }
}
