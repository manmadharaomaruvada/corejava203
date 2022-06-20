package assignments;

import java.util.Scanner;

public class SecondAssignment {
	String dayName;
	String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		String choice = sc.next();
		String name = choice.toUpperCase();
		switch (name) {
		case "SUNDAY":
			System.out.println(this.dayName = "SUN");
			break;
		case "MONDAY":
			System.out.println(this.dayName = "MON");
			break;
		case "TUESDAY":
			System.out.println(this.dayName = "TUE");
			break;
		case "WEDENSEDAY":
			System.out.println(this.dayName = "WED");
			break;
		case "THUSRSDAY":
			System.out.println(this.dayName = "THU");
			break;
		case "FRIDAY":
			System.out.println(this.dayName = "FRI");
			break;
		case "SATURDAY":
			System.out.println(this.dayName = "SAT");
			break;
		default:
			System.out.println("The value in the dayName: " + (this.dayName = null));

		}
		sc.close();

	}

	public static void main(String[] args) {
		SecondAssignment obj = new SecondAssignment();
		obj.setDayName(obj.dayName);
		obj.getNextDay();
		obj.getPreviousDay();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		obj.addToCurrentDay(number);
		sc.close();

	}

	public void getNextDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name) {
				if (i < 6) {
					System.out.println("next dayname:" + week[i + 1]);
				} else {
					i = 0;
					System.out.println("next day name:" + week[i]);
				}
			}
		}
	}

	public void getPreviousDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name) {
				if (i != 0) {
					System.out.println("previous dayname:" + week[i - 1]);
				} else {
					i = (week.length - 1);
					System.out.println("previous dayname:" + week[i]);
				}
			}
		}
	}

	public void addToCurrentDay(int noOfDays) {
		for (int i = 0; i < week.length; i++) {
			if (noOfDays > 0) {
				if (i + noOfDays <= 6) {
					i = i + noOfDays;
					System.out.println("days after adding the number:" + week[i]);
					break;
				}
			} else {
				int a = 7 + noOfDays;
				System.out.println("days before the number:" + week[i + a]);
			}
		}
	}

}
