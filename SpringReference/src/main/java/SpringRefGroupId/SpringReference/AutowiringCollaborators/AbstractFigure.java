package SpringRefGroupId.SpringReference.AutowiringCollaborators;

public abstract class AbstractFigure {

	private String figureName;

	public AbstractFigure(String figureName) {
		this.figureName = figureName;
		System.out
				.println("Figure bean " + figureName + " has been created...");
	}

	public String getFigureName() {
		return figureName;
	}

	public abstract double square();
}
