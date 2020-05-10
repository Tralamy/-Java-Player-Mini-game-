package net.object.test;

public class Player {

	/*Default stats*/

	private String name = "Player";
	private double healPotion, fireBallDamage, attack, health, maxHealth = health;
	private int fireBallPerPlayer , healPotionPerPlayer;

	/*Constructors*/
	
	public Player(String name, double health, double attack, int fireBallPerPlayer, int healPotionPerPlayer   ) {
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.fireBallPerPlayer = fireBallPerPlayer;
		this.healPotionPerPlayer = healPotionPerPlayer;
		maxHealth = health;
		fireBallDamage = 50.0;
		healPotion = 75.0;
	}

	public Player(String name, double health, double attack) {	
		this(name, health, attack, 2 ,2);
	}
	public Player(String name) {	
		this(name, 200.0, 20.0, 2 ,2);
	}



	/*Fonction*/
	
	/*Displays a player's stats*/
	public void stats() {
		System.out.println("Name:              " + this.name );
		System.out.println("Health:            " + this.health + "PV");
		System.out.println("Attack:            " + this.attack + "ATK");
		System.out.println("FireBall Amount:   " + this.fireBallPerPlayer);
		System.out.println("HealPotion Amount: " + this.healPotionPerPlayer);
	}
	
	/*Attack a player*/
	public void attack(Player a)  {
		a.health -= this.attack;
		if(a.health <= 0) {
			Fonction.pause(500);
			System.out.println(this.name + " attacked " + a.name +  ": " + this.attack + " DMG | " + a.name + ": " +0 + "PV");
			System.out.println(a.name +" was slain by " + this.name);
		} else {
			Fonction.pause(500);
			System.out.println(this.name + " attacked " + a.name +  ": " + this.attack + " DMG | " + a.name + ": " + a.health + "PV");
		}
		
	}
	
	/*Attack a player with a fire ball*/	
	public void fireBallAttack(Player a)  {
		if (this.fireBallPerPlayer > 0) {
			a.health -= fireBallDamage;
			this.fireBallPerPlayer-- ;
			if (this.fireBallPerPlayer == 0) {
				Fonction.pause(150);
				System.out.println(this.name + "' out of fireball");
			}
			if(a.health <= 0) {
				System.out.println(this.name + " attacked " + a.name+ " with a fire ball" +  ": " + fireBallDamage + " DMG | " + a.name + ": " + 0 + "PV");
				System.out.println(a.name +" was slain by " + this.name + " with a fire ball !");
			} else {
				Fonction.pause(500);
				System.out.println(this.name + " attacked " + a.name+ " with a fire ball" +  ": " + fireBallDamage + " DMG | " + a.name + ": " + a.health + "PV");
			}
		} else {
			Fonction.pause(500);
			System.out.println(this.name + ": You run out of Fire ball");
		}

	}
	
	/*Verify if a player is death*/
	
	public boolean isDeath() {
		if(this.health <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void kill() {
		this.health -= this.health;
		System.out.println(this.name + " was slain by dev!");
	}
	
	/*Heal a player*/
	public void potionHeal() {
		if(this.healPotionPerPlayer > 0) {
			this.health += healPotion ;
			if (this.health > this.maxHealth) {
				this.health = this.maxHealth;
			}
			this.healPotionPerPlayer--; 
			if(healPotionPerPlayer == 0) {
				Fonction.pause(500);
				System.out.println(this.name + "' out of Healing Potion");
			}
			Fonction.pause(1500);
			System.out.println(this.name + " have been cured of " + healPotion + " whith a Healing potion");
			System.out.println("\t" + this.name + ": " + this.health + " PV");
		} else {
			System.out.println(this.name + ": You run out of Healing potion");
		}
	}

	/*Player Health*/

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	/*Player Attack*/

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	/*FireBall Damage*/

	public double getFireBallDamage() {
		return fireBallDamage;
	}

	public void setFireBallDamage(double fireBallDamage) {
		this.fireBallDamage = fireBallDamage;
	}

	/*FireBall Amount*/

	public double getFireBallPerPlayer() {
		return fireBallPerPlayer;
	}

	public void setFireBallPerPlayer(int fireBallPerPlayer) {
		this.fireBallPerPlayer = fireBallPerPlayer;
	}

	/*Healing Potion*/

	public double getHealPotion() {
		return healPotion;
	}

	public void setHealPotion(double healPotion) {
		this.healPotion = healPotion;
	}

	/*Healing Potion Amount*/

	public double getHealPotionPerPlayer() {
		return healPotionPerPlayer;
	}

	public void setHealPotionPerPlayer(int healPotionPerPlayer) {
		this.healPotionPerPlayer = healPotionPerPlayer;
	}

	/*Player Name*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*Max health*/
	
	public double getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(double MaxHealth) {
		this.maxHealth = MaxHealth;
	}

	


	





}
