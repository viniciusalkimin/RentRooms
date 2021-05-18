package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Hotel {

	



		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
 
			Rooms[] r = new Rooms[10];

			System.out.print("Quantos quartos deseja alugar?");
			int rent = sc.nextInt();

			for (int cont = 0; cont < rent; cont++) {

				System.out.println("Aluguel #" + cont + ":");
				System.out.print("Nome:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				System.out.print("Quarto: ");
				int room = sc.nextInt();
				r[room] = new Rooms(name, email);

			}
			System.out.println();
			System.out.println("Quartos alugados: ");

			for (int cont = 0; cont < 10; cont++) {
				if (r[cont] != null) {
					System.out.println("Quarto " + cont + ": " + r[cont]);
				}
			}

			sc.close();
		}
	}
