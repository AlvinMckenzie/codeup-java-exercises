package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(int side) {
        super(side, side);
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
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
    this.width = width;
    }

//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//    public int getArea(){
//        return (int) Math.pow(side,2);
//    }



}

