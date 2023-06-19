package Homework6.work1;

// Квадрат
public class Square extends AbstractFigure {

    public Square(int height) {
        super(height);
    }

    public Square(){
        super();
    }

    @Override
    public int calculateArea() {
        return this.getHeight() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
