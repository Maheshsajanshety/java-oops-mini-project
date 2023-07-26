
package project;

public class main {

    public static void main(String[] args) {
        Square s = new Square();
        Rectangle R = new Rectangle();
        Circle c = new Circle();
        Geometry G = new Geometry();
        G.permit(R);
        G.permit(c);
        G.permit(s);
    }
}