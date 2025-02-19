package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		
		Champion champion1 = new Champion(name, life, attack, armor);
		
		System.out.println("Digite os dados do segundo campeão:");
		sc.nextLine();
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		System.out.println();
		
		Champion champion2 = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int t = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < t; i++) {
			System.out.printf("Resultado do turno %d:%n", i+1);
			champion1.takeDamage(champion2.getAttack());
			champion2.takeDamage(champion1.getAttack());
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			if (champion1.getLife() <= 0 || champion1.getLife() <= 0) {
				i = t;
			}
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
