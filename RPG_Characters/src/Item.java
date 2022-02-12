import java.util.ArrayList;

public abstract class Item {
	
	//---attributes
	private String name;
	private int required_level;
	private ArrayList<String> slot = new ArrayList<String>();
	private ArrayList<String> character = new ArrayList<String>();
	
	//---constructors
	public Item() {
	}
	
	public Item(String name, int required_level) {
		this.name = name;
		this.required_level = required_level;
	}
	
	public Item(String name, int required_level, String[] character) {
		this.name = name;
		this.required_level = required_level;
		this.character.add(character[0]);
		this.character.add(character[1]);
	}
	
	public Item(String name, int required_level, String[] slot, String[] character) {
		this.name = name;
		this.required_level = required_level;
		this.slot.add(slot[0]);
		this.slot.add(slot[1]);
		this.slot.add(slot[2]);
		this.character.add(character[0]);
		this.character.add(character[1]);
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
}
