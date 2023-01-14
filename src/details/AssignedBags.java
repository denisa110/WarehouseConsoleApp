package details;

import java.util.Scanner;

public class AssignedBags extends SystemBag {

	static int filled = 0;

	public static void AssignBags() {

		// creare array 2D pentru pozitia bagajelor din depozit
		char[][] position = new char[9][2];
		for (int i = 0; i < 9; i++) {
			position[i][0] = 'A';
			position[i][1] = 'B';
		}
		Scanner scanner = new Scanner(System.in);
		String positionNumber = scanner.nextLine();
		if (positionNumber.equals("q")) {
			System.out.print("Checked baggage");
			System.exit(0);
		}
		// ---------------------------------------------------------------------------------------------
		// Se va marca cu X pozitia bagajului

		while ((filled < 18) && (positionNumber.length() > 0)) {
			int row = positionNumber.charAt(0) - '1';
			int col = positionNumber.charAt(1) - 'A';

			if (row < 0 || row > 9 || col < 0 || col > 2) {
				System.out.println("Input error. Enter desired storage position (ex., '1A')," + "or q to quit.");
				positionNumber = scanner.nextLine();
				if (positionNumber.equals("q")) {
					System.out.println("Program ended!");
					System.exit(0);
				}

			} else {
				if (filled != 0) {
					System.out.println("This position is already in use. Please choose other one.");
				}
				if (position[row][col] != 'X') {
					position[row][col] = 'X';
					filled++;

					printPosition(position);
				} // ------------------------

				if (filled < 18) {
					System.out.println("Enter position to assign (ex., '1A')," + "or q to quit.");
					positionNumber = scanner.nextLine();

					if (positionNumber.equals("q")) {
						System.out.println("Program ended!");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("Final position assignments: ");
		printPosition(position);

	}

	public static void printPosition(char[][] position) {
		//int count = 0;
		System.out.println("Deposit available");
		for (int i = 0; i < position.length; i++) {
			System.out.println((i + 1) + "  " + position[i][0] + " " + position[i][1] + "  ");

		}

		int nrPositionAvailable = 0;
		nrPositionAvailable = (18 - filled);
		System.out.println("There are " + nrPositionAvailable + " positions available.");
	}

	@Override
	void start() {
		System.out.println("Please, wait !");
	}

	@Override
	void stop() {
		System.out.println("The aplication is stopped!");
	}

	@Override
	void end() {
	}
}
