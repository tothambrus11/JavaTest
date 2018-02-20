import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Tóth Ambrus
 *
 */
public class Controller {

	
	private ArrayList<Button> buttons;
	
	public void addButton(Button b) {
		this.buttons.add(b);
	}
	public Controller() {
		this.buttons = new ArrayList<Button>();
	}
	public void pressAll() {
		Button tempButton;
		for(int i = 0; i < this.buttons.size(); i++) {
			tempButton = this.buttons.get(i);
			tempButton.setState(true);
			this.buttons.set(i, tempButton);
		}
	}
	public void releaseAll() {
		Button tempButton;
		for(int i = 0; i < this.buttons.size(); i++) {
			tempButton = this.buttons.get(i);
			tempButton.setState(false);
			this.buttons.set(i, tempButton);
		}
	}
	public void look() {
		Button tempButton;
		for(int i = 0; i < this.buttons.size(); i++) {
			tempButton = this.buttons.get(i);
			System.out.println("ID: "+tempButton.getID()+"\tState: "+(tempButton.getState() ? "Pressed":"Not pressed"));
		}
	}
	public int getNumOfPressedBtns() {
		int count = 0;
		for(int i = 0; i < this.buttons.size(); i++) {
			if(this.buttons.get(i).getState()) {
				count++;
			}
		}
		return count;
	}

}
