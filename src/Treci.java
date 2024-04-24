import java.util.Scanner;

public class Treci {
	public static boolean validate(String s) {
		boolean result = true;
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		String s1 = String.valueOf(c1);
		String s2 = String.valueOf(c2);
		String hoursString = s1+s2;
		char c3 = s.charAt(3);
		char c4 = s.charAt(4);
		String s3 = String.valueOf(c3);
		String s4 = String.valueOf(c4);
		String minutesString = s3+s4;
		int hoursInteger = Integer.parseInt(hoursString);
		int minutesInteger = Integer.parseInt(minutesString);
		if(hoursInteger < 0 || hoursInteger > 23 || minutesInteger < 0 || minutesInteger > 59) {
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(validate(name));
	}

}
