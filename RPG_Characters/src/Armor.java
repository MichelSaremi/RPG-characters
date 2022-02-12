import java.util.ArrayList;

public class Armor extends Item {
	
	//---properties
	private String armortype;
	private int strength_add;
	private int dexterity_add;
	private int intelligence_add;
	
	//---constructors
	public Armor(String name, int req_lvl, String[] slot, String type, int str, int dex, int intel, String[] character) {
		super(name, req_lvl, slot, character);
		this.armortype = type;
		this.strength_add = str;
		this.dexterity_add = dex;
		this.intelligence_add = intel;
	}
	
	//---getters
	public String getArmorType() {
		return armortype;
	}
	public ArrayList<Integer> getArmorAttributes() {
		ArrayList<Integer> att = new ArrayList();
		att.add(strength_add); 
		att.add(dexterity_add); 
		att.add(intelligence_add);
		return att;
	}
}
