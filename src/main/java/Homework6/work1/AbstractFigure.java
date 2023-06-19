package Homework6.work1;

public abstract class AbstractFigure {

    int height;

    public AbstractFigure(int height) {
        this.height = height;
    }

    public AbstractFigure() {
        this.height = 0;
    }

    public abstract int calculateArea();

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
