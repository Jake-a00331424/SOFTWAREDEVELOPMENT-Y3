public class BlueShapeDecorator extends ShapeDecorator {
	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	public void draw() {
		decoratedShape.draw();
		setBlueBoarder(decoratedShape);
	}
	private void setBlueBoarder(Shape decoratedShape) {
		System.out.println("Border Color: Blue");
	}
}