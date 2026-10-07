
public class Tester {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Animal t2 = new Tiger();
		Animal b = new Bird();
		Bird b2 = new Bird();
		System.out.println(t.getNumLegs());
		System.out.println(t2.getNumLegs());
		System.out.println(b.getNumLegs());
		System.out.println(t.getSound());
		System.out.println(b2.flapWings());
		
	}
	
}
