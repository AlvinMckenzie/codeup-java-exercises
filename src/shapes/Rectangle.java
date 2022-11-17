package shapes;

public class Rectangle {
    public String getPerimeter;
    protected int length;
    protected int width;

    public Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public int getArea(){
        return length * width;
    }

}
