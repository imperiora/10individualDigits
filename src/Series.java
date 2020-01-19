import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input six non-negative digits: ");
		int integers = input.nextInt();

		int sixdigit = integers % 10;
		int remaining = integers / 10;

		int fifthdigit = remaining % 10;
		remaining = remaining / 10;

		int fourthdigit = remaining % 10;
		remaining = remaining / 10;

		int thirddigit = remaining % 10;
		remaining = remaining / 10;

		int seconddigit = remaining % 10;
		remaining = remaining / 10;

		int firstdigit = remaining;

		System.out.println(firstdigit + " " + seconddigit + " " + thirddigit + " " + fourthdigit + " " + fifthdigit
				+ " " + sixdigit);
	}
}