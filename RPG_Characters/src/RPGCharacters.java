import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RPGCharacters {

	
	String[] choice; 
	Hero player;
	int charDPS;
	ArrayList<Weapon> weaponslist = new ArrayList();
	
	
	public static void main(String[] args) {
		
		RPGCharacters main = new RPGCharacters();
		main.MakeWeapons();
		main.Go();
		
	}

	private void MakeWeapons() {
		//---axes
		Weapon StoneAxe = new Weapon("Stone axe", 1, "weapon", "axe", 2, 1.5, new String[] {"Warrior",""});
		weaponslist.add(StoneAxe);
		Weapon BronzeAxe = new Weapon("Bronze axe", 2, "weapon", "axe", 4, 2, new String[] {"Warrior",""});
		weaponslist.add(BronzeAxe);
		Weapon SteelAxe = new Weapon("Steel axe", 3, "weapon", "axe", 6, 2.5, new String[] {"Warrior",""});
		weaponslist.add(SteelAxe);
		//---hammers
		Weapon StoneHammer = new Weapon("Stone hammer", 1, "weapon", "hammer", 3, 1.5, new String[] {"Warrior",""});
		weaponslist.add(StoneHammer);
		Weapon BronzeHammer = new Weapon("Bronze hammer", 2, "weapon", "hammer", 5, 2, new String[] {"Warrior",""});
		weaponslist.add(BronzeHammer);
		Weapon SteelHammer = new Weapon("Steel hammer", 3, "weapon", "hammer", 7, 2.5, new String[] {"Warrior",""});
		weaponslist.add(SteelHammer);
		//---swords
		Weapon WoodenSword = new Weapon("Wooden sword", 1, "weapon", "sword", 2.5, 1.5, new String[]{"Warrior","Rogue"});
		weaponslist.add(WoodenSword);
		Weapon BronzeSword = new Weapon("Bronze sword", 2, "weapon", "sword", 4.5, 2, new String[]{"Warrior","Rogue"});
		weaponslist.add(BronzeSword);
		Weapon SteelSword = new Weapon("Steel sword", 3, "weapon", "sword", 6.5, 2.5, new String[]{"Warrior","Rogue"});
		weaponslist.add(SteelSword);
		//---daggers
		Weapon WoodenDagger = new Weapon("Wooden dagger", 1, "weapon", "dagger", 2, 1.5, new String[] {"Rogue",""});
		weaponslist.add(WoodenDagger);
		Weapon BronzeDagger = new Weapon("Bronze dagger", 2, "weapon", "dagger", 4, 2, new String[] {"Rogue",""});
		weaponslist.add(BronzeDagger);
		Weapon SteelDagger = new Weapon("Steel dagger", 3, "weapon", "dagger", 6, 2.5, new String[] {"Rogue",""});
		weaponslist.add(SteelDagger);
		//---bows
		Weapon WoodenBow = new Weapon("Wooden bow", 1, "weapon", "bow", 3, 1.5, new String[] {"Ranger",""});
		weaponslist.add(WoodenBow);
		Weapon CompoundBow = new Weapon("Compound bow", 2, "weapon", "bow", 5, 2, new String[] {"Ranger",""});
		weaponslist.add(CompoundBow);
		Weapon LongBow = new Weapon("Long bow", 3, "weapon", "bow", 7, 2.5, new String[] {"Ranger",""});
		weaponslist.add(LongBow);
		//---staffs
		Weapon WoodenStaff = new Weapon("Wooden staff", 1, "weapon", "staff", 4, 1.5, new String[] {"Mage",""});
		weaponslist.add(WoodenStaff);
		Weapon ObsidianStaff = new Weapon("Obsidian staff", 2, "weapon", "staff", 5, 2, new String[] {"Mage",""});
		weaponslist.add(ObsidianStaff);
		Weapon FireStaff = new Weapon("Fire staff", 3, "weapon", "staff", 8, 2.5, new String[] {"Mage",""});
		weaponslist.add(FireStaff);
		//---wands
		Weapon WoodenWand = new Weapon("Wooden wand", 1, "weapon", "wand", 3, 1.5, new String[] {"Mage",""});
		weaponslist.add(WoodenWand);
		Weapon ObsidianWand = new Weapon("Obsidian wand", 2, "weapon", "wand", 4, 2, new String[] {"Mage",""});
		weaponslist.add(ObsidianWand);
		Weapon FireWand = new Weapon("Fire wand", 3, "weapon", "wand", 6, 2.5, new String[] {"Mage",""});
		weaponslist.add(FireWand);
	}
	
	private void Go() {
		
		while(true) {
		commandinput();
		//"Enter 'start,your_name,your_class' : ");
		
		//---Building the hero
		if(choice[0].equals("start") && choice[2].equals("Warrior")) {
			player = new Hero(choice[1], choice[2], 5, 2, 1, 5);	
		}	
		else if(choice[0].equals("start") && choice[2].equals("Rogue")) {
			player = new Hero(choice[1], choice[2], 2, 6, 1, 6);
		}
		else if(choice[0].equals("start") && choice[2].equals("Ranger")) {
			player = new Hero(choice[1], choice[2], 1, 7, 1, 7);
		}
		else if(choice[0].equals("start") && choice[2].equals("Mage")) {
			player = new Hero(choice[1], choice[2], 1, 1, 8, 8);
		}
		
		//---level up hero
		//---enter level up
		if (choice[0].equals("level up") && player.getChar().equals("Warrior")) {
			
			int new_level = player.getLevel() + 1;
			player.setLevel(new_level);
			
			int new_strength = player.getBase_Strength() + 3;
			int new_Dexterity = player.getBase_Dexterity() + 2;
			int new_Intelligence = player.getBase_Intelligence() + 1;
			player.setBaseAtt(new_strength, new_Dexterity, new_Intelligence);
			player.setTotalAtt(new_strength, new_Dexterity, new_Intelligence);
		}
		
		if (choice[0].equals("level up") && player.getChar().equals("Rogue")) {
			
			int new_level = player.getLevel() + 1;
			player.setLevel(new_level);
			
			int new_strength = player.getBase_Strength() + 1;
			int new_Dexterity = player.getBase_Dexterity() + 4;
			int new_Intelligence = player.getBase_Intelligence() + 1;
			player.setBaseAtt(new_strength, new_Dexterity, new_Intelligence);
			player.setTotalAtt(new_strength, new_Dexterity, new_Intelligence);
		}
		
		if (choice[0].equals("level up") && player.getChar().equals("Ranger")) {
			
			int new_level = player.getLevel() + 1;
			player.setLevel(new_level);
			
			int new_strength = player.getBase_Strength() + 1;
			int new_Dexterity = player.getBase_Dexterity() + 5;
			int new_Intelligence = player.getBase_Intelligence() + 1;
			player.setBaseAtt(new_strength, new_Dexterity, new_Intelligence);
			player.setTotalAtt(new_strength, new_Dexterity, new_Intelligence);
		}
		
		if (choice[0].equals("level up") && player.getChar().equals("Mage")) {
			
			int new_level = player.getLevel() + 1;
			player.setLevel(new_level);
			
			int new_strength = player.getBase_Strength() + 1;
			int new_Dexterity = player.getBase_Dexterity() + 1;
			int new_Intelligence = player.getBase_Intelligence() + 5;
			player.setBaseAtt(new_strength, new_Dexterity, new_Intelligence);
			player.setTotalAtt(new_strength, new_Dexterity, new_Intelligence);
		}
		
		//---Display weapons
		//---Enter display weapons
		if (choice[0].equals("display weapons")) {
			weaponsDisplay();
		}
		
		//---Equip weapons
		//---Enter equip weapon,weapon name
		if (choice[0].equals("equip weapon")) {
			try {
				equipWeapon();
			} catch (InvalidWeaponException e) {
				e.printStackTrace();
			}
			updateStatsWithWeapon();
		}
		
		if (player != null && player.getWeapon()== null) {
			damagePerSecond();
		}
		
		initialStatsDisplay();
		continue;
		}
	}
	
	private void equipWeapon() throws InvalidWeaponException {
		for(Weapon item : weaponslist) {
			if (item.getName().equals(choice[1])) {
					if (!item.getChar().get(0).equals(player.getChar()) && !item.getChar().get(1).equals(player.getChar())) {
						throw new InvalidWeaponException("This weapon is not available to your class!");
					}
					else if (item.getRequired_level()>player.getLevel()) {
						throw new InvalidWeaponException("You dont have sufficient level to equip weapon!");
					}
					else {
						player.setWeapon(item);
					}
			}
	}
	}
	private void updateStatsWithWeapon() {
		double weaponAttackPerSec = (double) player.getWeapon().getAttacks_per_second();
		double weaponDmg = (double) player.getWeapon().getDamage();
		double weaponDmgPerSec = weaponDmg * weaponAttackPerSec;
		
		if (player.getChar().equals("Warrior")) {
			double CharDPS = weaponDmgPerSec*(1+(player.getTotal_Strength()/100));
			player.setDPS(CharDPS);
		}
		else if (player.getChar().equals("Rogue")) {
			double CharDPS = weaponDmgPerSec*(1+(player.getTotal_Dexterity()/100));
			player.setDPS(CharDPS);
		}
		else if (player.getChar().equals("Ranger")) {
			double CharDPS = weaponDmgPerSec*(1+(player.getTotal_Dexterity()/100));
			player.setDPS(CharDPS);
		}
		else if (player.getChar().equals("Mage")) {
			double CharDPS = weaponDmgPerSec*(1+(player.getTotal_Intelligence()/100));
			player.setDPS(CharDPS);
		}
	}
	
	private void commandinput() {
		System.out.println("Enter your command : ");
		Scanner input = new Scanner(System.in); 
		String Cstring = input.nextLine();
		choice = Cstring.split(",");
		
	}
	private void initialStatsDisplay() {
		StringBuilder stats = new StringBuilder();
		stats.append("----------------------- \n");
		stats.append("Hero stats \n");
		stats.append("---------- \n");
		stats.append("Name : "+player.getName()+"\n");
		stats.append("Type : "+player.getChar()+"\n");
		stats.append("Level : "+player.getLevel()+"\n");
		stats.append("Strength :"+player.getTotal_Strength()+"\n");
		stats.append("Dexterity :"+player.getTotal_Dexterity()+"\n");
		stats.append("Intelligence :"+player.getTotal_Intelligence()+"\n");
		stats.append("Damage per second :"+player.getDPS()+"\n");
		stats.append("----------------------- \n");
		System.out.println(stats);
	}
	
	private void damagePerSecond() {
		charDPS = 1 + (1*(player.getMainPrimaryAtt()/100));
		player.setDPS(charDPS);
	}
	
	private void weaponsDisplay() {
		StringBuilder weapons = new StringBuilder();
		weapons.append("----------------------- \n");
		weapons.append("name; lvl-required; slot; damage; attacks/second; class \n");
		weapons.append("--------axes---------\n");
		weapons.append("Stone axe; 1; weapon; 2; 1.5; Warriors \n");
		weapons.append("Bronze axe; 2; weapon; 4; 2; Warriors \n");
		weapons.append("Steel axe; 3; weapon; 6; 2.5; Warriors \n");
		weapons.append("--------hammers---------\n");
		weapons.append("Stone hammer; 1; weapon; 3; 1.5; Warriors \n");
		weapons.append("Bronze hammer; 2; weapon; 5; 2; Warriors \n");
		weapons.append("Steel hammer; 3; weapon; 7; 2.5; Warriors \n");
		weapons.append("--------swords---------\n");
		weapons.append("Wooden sword; 1; weapon; 2.5; 1.5; Warriors, Rogues \n");
		weapons.append("Bronze sword; 2; weapon; 4.5; 2; Warriors, Rogues \n");
		weapons.append("Steel sword; 3; weapon; 6.5; 2.5; Warriors, Rogues \n");
		weapons.append("--------daggers---------\n");
		weapons.append("Wooden dagger; 1; weapon; 2; 1.5; Rogues \n");
		weapons.append("Bronze dagger; 2; weapon; 4; 2; Rogues \n");
		weapons.append("Steel dagger; 3; weapon; 6; 2.5; Rogues \n");
		weapons.append("--------bows---------\n");
		weapons.append("Wooden bow; 1; weapon; 3; 1.5; Rangers \n");
		weapons.append("Compound bow; 2; weapon; 5; 2; Rangers \n");
		weapons.append("Long bow; 3; weapon; 7; 2.5; Rangers \n");
		weapons.append("--------staffs---------\n");
		weapons.append("Wooden staff; 1; weapon; 4; 1.5; Mages \n");
		weapons.append("Obsidian staff; 2; weapon; 5; 2; Mages \n");
		weapons.append("Fire staff; 3; weapon; 8; 2.5; Mages \n");
		weapons.append("--------wands---------\n");
		weapons.append("Wooden wand; 1; weapon; 3; 1.5; Mages \n");
		weapons.append("Obsidian wand; 2; weapon; 4; 2; Mages \n");
		weapons.append("Fire wand; 3; weapon; 6, 2.5; Mages \n");
		System.out.println(weapons);
	}
}
