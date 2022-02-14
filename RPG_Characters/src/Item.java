import java.util.ArrayList;

public abstract class Item {
	
	//---attributes
	private String name;
	private int required_level;
	private ArrayList<String> slot = new ArrayList<String>();
	private ArrayList<String> character = new ArrayList<String>();
	private String type;
	
	//---constructors
	//---type is not used here but was added as it was displayed in Appendix C
	
	//---used by Weapon class
	public Item(String name, int required_level, String[] character, String type) {
		this.name = name;
		this.required_level = required_level;
		this.character.add(character[0]);
		this.character.add(character[1]);
		this.type = type;
	}
	//---used by Armor class
	public Item(String name, int required_level, String[] slot, String[] character, String type) {
		this.name = name;
		this.required_level = required_level;
		this.slot.add(slot[0]);
		this.slot.add(slot[1]);
		this.slot.add(slot[2]);
		this.character.add(character[0]);
		this.character.add(character[1]);
		this.character.add(character[2]);
		this.type = type;
	}
	
	//---getters
	public String getName() {
		return name;
	}
	public int getRequired_level() {
		return required_level;
	}
	public ArrayList<String> getSlot() {
		return slot;
	}
	public ArrayList<String> getChar() {
		return character;
	}
	public String getType() {
		return type;
	}
}
