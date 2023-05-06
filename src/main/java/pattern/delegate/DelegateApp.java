package pattern.delegate;

//https://kurl.ru/YLbzA
public class DelegateApp {

    public static void main(String[] args) {

        //1
        A a = new A();
        a.f();

        B b = new B();
        b.f();

        //2

        class Painter {
            Graphics graphics;

            public void setGraphics(Graphics graphics) {
                this.graphics = graphics;
            }

            void draw() {
                graphics.draw();
            }
        }

        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.draw();
        painter.setGraphics(new Square());
        painter.draw();
        painter.setGraphics(new Triangle());
        painter.draw();
    }
}

//1
class A {
    void f() {
        System.out.println("f()");
    }
}

// В должен реализовать то же самое
class B {
    A a = new A();
    void f(){
        a.f();
    }
}

//2
interface Graphics {
    void draw();
}

class Triangle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}

class Square implements Graphics {

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}