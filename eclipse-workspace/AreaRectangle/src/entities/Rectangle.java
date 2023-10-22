package entities;

public class Rectangle {
	public double width;
	public double height;

	public double Area() {
		return this.width * this.height;
	}

	public double Perimeter() {
		return (this.width + this.height) * 2;
	}

	public double Diagonal() {
		return Math.sqrt((Math.pow(this.height, 2) + Math.pow(this.width, 2)));
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f",Area())
				+ String.format("%n")
				+ "Perimeter = "
				+ String.format("%.2f",Perimeter())
				+ String.format("%n")
				+ "Diagonal = "
				+ String.format("%.2f",Diagonal());
	}

}