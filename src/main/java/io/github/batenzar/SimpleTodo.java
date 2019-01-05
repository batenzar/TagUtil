package io.github.batenzar;

import java.util.List;
import java.util.Scanner;

public class SimpleTodo {

	public static void main(String[] args) {
		SimpleTodo todo = new SimpleTodo();

		while (true) {
			todo.displayMainMenu();
			String input = todo.getInput();

			switch (input) {
			case "1":
				System.out.println("Please type some text.");
				String str = todo.getInput();
				List<String> tags = Util.getTags(str);
				tags.forEach(System.out::println);
				System.out.println("====================");
				break;
			case "exit":
				System.exit(0);
			default:
				System.out.println("Sorry, I don't know that choice.");
			}
		}

	}

	private void displayMainMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello!! What can I do for you?\n");
		sb.append("1 -> Test finding Tags\n");
		sb.append("exit -> Exit the program.\n");

		System.out.println(sb.toString());
	}

	private String getInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

}
