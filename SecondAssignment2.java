package assignments;

import java.util.*;

public class SecondAssignment2 {
	//Scanner sc = new Scanner(System.in);
	String s1;
	int i;
	public String dayName;
	String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfDays;

		SecondAssignment2 obj = new SecondAssignment2();
		obj.setDayName(obj.dayName);
		obj.getNextDay();
		obj.getPreviousDay();

		System.out.println("enter the day number");
		noOfDays = sc.nextInt();
		obj.addToCurrentDay(noOfDays);
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your Day:");
		String choice = s.next();

		String name = choice.toUpperCase();
		s1 = name.substring(0, 3);

		switch (s1) {
		case "SUN":
			System.out.println(this.dayName = "SUN");
			break;

		case "MON":
			System.out.println(this.dayName = "MON");
			break;

		case "TUE":
			System.out.println(this.dayName = "TUE");
			break;

		case "WED":
			System.out.println(this.dayName = "WED");
			break;

		case "THU":
			System.out.println(this.dayName = "THU");
			break;

		case "FRI":
			System.out.println(this.dayName = "FRI");
			break;

		case "SAT":
			System.out.println(this.dayName = "SAT");
			break;

		default:
			System.out.println("the value in dayName :" + (this.dayName = null));
		}
	}

	public String getDayName() {
		this.dayName = dayName;
		return dayName;
	}

	public void getNextDay() {
		for (i = 0; i < week.length; i++) {
			if (week[i].equals(dayName)) {
				if (week[i] == "SAT") {
					System.out.println("Next Day is:" + "SUN");
				} else {
					System.out.println("NextDay is:" + week[i + 1]);
				}
				System.out.println("getnext is" + week[i]);
			}
		}
	}

	public void getPreviousDay() {
		for (i = 0; i < week.length - 1; i++) {
			if (week[i].equals(dayName)) {
				if (week[i] == "SUN") {
					System.out.println("Previous is:" + "SAT");
				} else {
					System.out.println("Previous is:" + week[i - 1]);
				}
			}
		}
	}

	public void addToCurrentDay(int noOfDays) {

		for (i = 0; i < week.length; i++) {
			if (week[i] == this.dayName) {
				if (noOfDays > 0) {
					if (i + noOfDays <= 6) {
						System.out.println(week[i + noOfDays]);
					} else {
						int a = (i + noOfDays)%7;
						System.out.println(week[a]);
					}
				}
			}
		}

	}
}
