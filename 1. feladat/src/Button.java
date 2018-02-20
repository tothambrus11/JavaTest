/**
 * 
 */

/**
 * @author Tóth Ambrus
 *
 */
public class Button {

	/**
	 * 
	 */
	private String ID;
	private boolean pressed;
	
	public Button(String ID, boolean pressed) {
		this.ID = ID;
		this.pressed = pressed;
	}
	public String getID() {
		return this.ID;
	}
	public boolean getState() {
		return this.pressed;
	}
	public void setState(boolean pressed) {
		this.pressed = pressed;
	}

}
