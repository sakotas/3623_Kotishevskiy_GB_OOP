package Homework6.work1;

// Прямоугольник
public class Rectangle extends AbstractFigure implements Width {

    Integer width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return this.getHeight() * this.getWidth();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
