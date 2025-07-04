package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner sc = new Scanner(System.in);
		RockPaperScissors game = new RockPaperScissors();
		while (true) {
			System.out.print("\nYour choice: ");
			String playerInput = sc.nextLine().trim();

			if (playerInput.equalsIgnoreCase("exit")) {
				break;
			}

			if (!playerInput.equalsIgnoreCase("Rock") &&
					!playerInput.equalsIgnoreCase("Paper") &&
					!playerInput.equalsIgnoreCase("Scissor")) {
				System.out.println("Invalid input. Try again.");
				continue;
			}

			String result = game.playerRockPaperScissors(playerInput);
			System.out.println("Computer chose: " + game.getComputerChoice());
			System.out.println("Result: " + result);
			System.out.println("Player Score: " + game.getPlayerScore() + " | Computer Score: " + game.getComputerScore());
		}



		sc.close();
	}
}


