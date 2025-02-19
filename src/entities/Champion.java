package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}



	public int getArmor() {
		return armor;
	}



	public void setArmor(int armor) {
		this.armor = armor;
	}



	public int getLife() {
		return life;
	}



	public void takeDamage(int damage) {
		if (armor > damage) {
			life -= 1;
		}
		else {
			life = life - (damage - armor);
		}
	}
	
	public String status() {
		if (life <= 0) {
			return String.format("%s: 0 de vida (morreu)", name, life);
		}
		else {
			return String.format("%s: %d de vida", name, life);
		}
	}
}
