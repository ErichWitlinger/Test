package de.hhu.propra;

/**
 * Created by Admin on 16.04.2014.
 */
public class App {

    private int width2, height;

    public App(int width2, int height) {
        this.width2 = width2;
        this.height = height;
    }

    public int getWidth2() {
        return width2;
    }

    public void setWidth2(int width2) {
        this.width2 = width2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void main(String[] args) {

        for (int i = 0; i < 1024; i++) {
            print(i);
        }
    }

    private void print(int i) {

    }
}
