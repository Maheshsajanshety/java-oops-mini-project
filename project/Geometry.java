package project;

class Geometry {
    public void permit(Shape ref) {
        ref.acceptInput();
        ref.compute();
        ref.display();
    }

}
