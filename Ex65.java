package bookExercises;

import javax.swing.JOptionPane;

public class Ex65 {

	public static void main(String[] args) {

		int[] a = new int[10];

		int[] b = new int[10];

		int lines = 10, column = 1;

		int[][] c = new int[lines][column];

		String userAnswer;

		do {

			for (int i = 0; i < a.length; i++) {

				a[i] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Insert values for array A" + "\nIndex: " + i));

			}

			for (int i = 0; i < b.length; i++) {

				b[i] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Insert values for array B" + "\nIndex: " + i));

			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					c[i][j] = a[i] * b[i];

					System.out.println(c[i][j] + " ");

				}
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
