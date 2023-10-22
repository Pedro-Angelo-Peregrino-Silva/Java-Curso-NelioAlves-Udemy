package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("1º Note: ");
		student.note_1 = sc.nextDouble();
		
		System.out.print("2º Note: ");
		student.note_2 = sc.nextDouble();
		
		System.out.print("3º Note: ");
		student.note_3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(student);

	}

}
