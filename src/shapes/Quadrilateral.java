package shapes;

public abstract class Quadrilateral extends shape implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int l, int w){
        this.length = l;
        this.width = w;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
