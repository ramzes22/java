package SpringRefGroupId.SpringReference.AutowiringCollaborators;

public class Circle extends AbstractFigure {
	
	private int radius;
    public static double PI = 3.1415;
    
    public Circle(String figureName, int radius) {
    	super(figureName);
		this.radius = radius;
	}
    
	@Override
	public double square() {
		return PI*this.radius*this.radius;
	}
}
