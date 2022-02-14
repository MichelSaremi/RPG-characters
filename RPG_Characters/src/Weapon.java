
public class Weapon extends Item {
	
	//---properties
	private double damage;
	private double attacks_per_second;
	

	//---constructors
	
	//---the slot value is not used here, but I left it in case at some point you would want to add more than one weapon slot
	//---it is not necessary to refer to this slot until then
	//---slot is just a placeholder here for future upgrades
	public Weapon(String name, int req_lvl, String slot, String type, double damage, double a_p_s, String[] character) {
		super(name, req_lvl, character, type);
		this.damage = damage;
		this.attacks_per_second = a_p_s;

	}
	
	//---getters
	public double getDamage() {
		return damage;
	}
	public double getAttacks_per_second() {
		return attacks_per_second;
	}
	
}
