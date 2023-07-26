package project;

 abstract class Shape {
    float area;
		abstract public void acceptInput();
		abstract public void compute();
		public void display() {
			System.out.println("your result is"+area);
		}
}
