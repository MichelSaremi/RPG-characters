import java.util.HashMap;

public class Hero {
	
	//---char
	private String name;
	private String character;
	private int level = 1;
	
	//---attributes
	private int base_Strength;
	private int base_Dexterity;
	private int base_Intelligence;
	
	private int total_Strength;
	private int total_Dexterity;
	private int total_Intelligence;
	
	private int mainPrimaryAtt;
	
	//---damage
	private double damage_per_second;
	
	
	//---equipment
	HashMap<String,Item> equipment = new HashMap<>();
	
	//---constructor
	public Hero(String name, String character, int base_Strength, int base_Dexterity, int base_Intelligence, int mainPrimaryAtt) {
		this.name = name;
		this.character = character;
		this.base_Strength = base_Strength;
		this.base_Dexterity = base_Dexterity;
		this.base_Intelligence = base_Intelligence;
		this.mainPrimaryAtt = mainPrimaryAtt;
		
		this.total_Strength = base_Strength;
		this.total_Dexterity = base_Dexterity;
		this.total_Intelligence = base_Intelligence;
		
	}
	//---setters
	public void setBaseAtt(int base_Strength, int base_Dexterity, int base_Intelligence) {
		this.base_Strength = base_Strength;
		this.base_Dexterity = base_Dexterity;
		this.base_Intelligence = base_Intelligence;
	}
	public void setTotalAtt(int total_Strength, int total_Dexterity, int total_Intelligence) {
		this.total_Strength = total_Strength;
		this.total_Dexterity = total_Dexterity;
		this.total_Intelligence = total_Intelligence;
	}
	
	public void setLevel(int level) {
		this.level= level;
	}
	
	public void setDPS(double DPS) {
		this.damage_per_second=DPS;
	}
	
	public void setWeapon(Weapon weapon) {
		equipment.put("Weapon", weapon);
	}
	
	//---getters
	public String getName() {
		return name;
	}
	public String getChar() {
		return character;
	}
	public int getLevel() {
		return level;
	}
	public int getBase_Strength() {
		return base_Strength;
	}
	public int getBase_Dexterity() {
		return base_Dexterity;
	}
	public int getBase_Intelligence() {
		return base_Intelligence;
	}
	public int getTotal_Strength() {
		return total_Strength;
	}
	public int getTotal_Dexterity() {
		return total_Dexterity;
	}
	public int getTotal_Intelligence() {
		return total_Intelligence;
	}
	public int getMainPrimaryAtt() {
		return mainPrimaryAtt;
	}
	public double getDPS() {
		return damage_per_second;
	}
	public Weapon getWeapon() {
		return (Weapon) equipment.get("Weapon");
	}
	
}	
	
