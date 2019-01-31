class Loops {

	public void printEmpytLine() {
		System.out.println();
	}

	public void printWithFor(int[] numbers) {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i]);
		}
		printEmpytLine();
	}

	public void printWithForReversed(int[] numbers) {
		for (int i = numbers.length; i > 0; --i) {
			System.out.print(numbers[i - 1]);
		}
		printEmpytLine();
	}

	public void printWithEncancedFor(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number);
		}
		printEmpytLine();
	}

	public void printWithWhile(int[] numbers) {
		int i = 0;
		while (i < numbers.length) {
			System.out.print(numbers[i]);
			++i;
		}
		printEmpytLine();
	}

	public void printWithWhileReversed(int[] numbers) {
		int i = numbers.length;
		while (i > 0) {
			System.out.print(numbers[i - 1]);
			--i;
		}
		printEmpytLine();
	}

	public void printWithDoWhile(int[] numbers) {
		if (numbers.length == 0)
			return;

		int i = 0;
		do {
			System.out.print(numbers[i]);
			++i;
		} while (i < numbers.length);
		printEmpytLine();
	}

	public void printWithDoWhilwReversed(int[] numbers) {
		if (numbers.length == 0)
			return;

		int i = numbers.length;
		do {
			System.out.print(numbers[i - 1]);
			--i;
		} while (i > 0);
		printEmpytLine();
	}

	public static void main(String[] args) {
		System.out.println("This program demonstrates how different Java loop statements achieve same result");
		System.out.println("All loops print out contents of an array from start and from end");

		int[] numbers = {1, 3, 5, 7, 9};
		Loops loops = new Loops();

		loops.printWithFor(numbers);
		loops.printWithForReversed(numbers);

		loops.printWithWhile(numbers);
		loops.printWithWhileReversed(numbers);

		loops.printWithDoWhile(numbers);
		loops.printWithDoWhilwReversed(numbers);

		// This is a different kind of for loop
		loops.printWithEncancedFor(numbers);
	}
}
