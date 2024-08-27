import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Name: ");
		student.name = sc.nextLine();

		System.out.println("Nota1: ");
		student.nota1 = sc.nextDouble();

		System.out.println("Nota2: ");
		student.nota2 = sc.nextDouble();

		System.out.println("Nota3: ");
		student.nota3 = sc.nextDouble(); 

		System.out.printf("Nota Final: %.2f%n", student.notaFinal());

		if (student.notaFinal() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - student.notaFinal()));
		}
		sc.close();
	}
}
