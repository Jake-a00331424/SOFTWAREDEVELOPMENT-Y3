
public class Shape {
	
	private int numOfSides;
	private String colour;
	private int numOfEdges;
	
	public Shape(int numOfSides, String colour, int numOfEdges) {
		this.numOfSides = numOfSides;
		this.colour = colour;
		this.numOfEdges = numOfEdges;
	}
	public int getNumOfSides() {
		return numOfSides;	
	}
	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	public String getColour() {
		return colour;	
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNumOfEdges() {
		return numOfEdges;	
	}
	public void setNumOfEdges(int numOfEdges) {
		this.numOfEdges = numOfEdges;
	}
	
}
