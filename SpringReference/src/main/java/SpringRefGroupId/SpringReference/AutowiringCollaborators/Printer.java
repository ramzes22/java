package SpringRefGroupId.SpringReference.AutowiringCollaborators;

public class Printer {

	private AbstractFigure figure;

	public void setFigure(AbstractFigure figure) {
		this.figure = figure;
	}

	public void printFigure() {
		System.out.println("Square of " + this.figure.getFigureName() + " is "
				+ this.figure.square());
	}
}
