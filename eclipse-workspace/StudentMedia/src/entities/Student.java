package entities;

public class Student {
	public String name;
	public String resp;
	public double note_1;
	public double note_2;
	public double note_3;

	public double finalGrade() {
		return this.note_1 + this.note_2 + this.note_3;
	}

	public String aprovedReproved() {

		if (finalGrade() >= 60) {
			this.resp = "PASS";
		} else {
			this.resp = String.format("FAILED%n") + String.format("Missing = %.2f points%n", (60 - finalGrade()));
		}

		return this.resp;

	}

	public String toString() {
		return String.format("Final grade = %.2f%n", finalGrade()) + aprovedReproved();
	}

}
