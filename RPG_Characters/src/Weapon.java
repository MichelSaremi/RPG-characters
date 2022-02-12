import java.util.ArrayList;

public class Weapon extends Item {
	
	//---properties
	private String weapontype;
	private double damage;
	private double attacks_per_second;
	private String slot;
	
	//---constructors
	public Weapon() {}
		
	
	public Weapon(String name, int req_lvl, String slot, String type, double damage, double a_p_s, String[] character) {
		super(name, req_lvl, character);
		this.weapontype = type;
		this.damage = damage;
		this.attacks_per_second = a_p_s;
		this.slot = slot;

	}
	
	//---getters
	public String getWeaponType() {
		return weapontype;
	}
	public double getDamage() {
		return damage;
	}
	public double getAttacks_per_second() {
		return attacks_per_second;
	}
	
}
