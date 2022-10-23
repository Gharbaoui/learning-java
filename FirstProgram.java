import java.util.Scanner;

class	FirstProgram {
	public static void	main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;

		num = input.nextInt();
		System.out.println("square of number: " + (num * num));
		input.close();
	}
}
