package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int l, int w) {
        super(l, w);
    }

    @Override
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
//    public String getPerimeter;
//    protected int length;
//    protected int width;
//
//    public Rectangle(int l, int w){
//        this.length = l;
//        this.width = w;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    public int getArea(){
//        return length * width;
//    }

}
