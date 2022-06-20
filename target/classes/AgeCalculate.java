package assignments;

import java.util.Scanner;

public class AgeCalculate {
	static double calculateAge(int birthYear, int birthMonth) {
		double age = 2022 - birthYear;
		double age1 = (12 * age + birthMonth) / 12;
		if (birthYear < 1 || birthMonth < 1) {
			return 1.0;
		} else if (birthYear > 2022 && birthMonth > 6) {
			return 2.0;
		} else {
			return age1;
		}

	}

	public static void main(String args[]) {
		double birthYear, birthMonth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Birth Year :");
		birthYear = sc.nextDouble();
		System.out.println("Enter Birth month");
		birthMonth = sc.nextDouble();
		System.out.printf("%.2f"+calculateAge((int)birthYear, (int)birthMonth));
		sc.close();
	}
}
