/**
 * 
 */

/**
 * @author Tóth Ambrus
 *
 */
import java.util.ArrayList;

public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		
		Button buttonA = new Button("A", true);
		Button buttonB = new Button("B", false);
		Button buttonX = new Button("X", false);
		Button buttonY = new Button("Y", true);
		
		ctrl.addButton(buttonA);
		ctrl.addButton(buttonB);
		ctrl.addButton(buttonX);
		ctrl.addButton(buttonY);
		
		System.out.println(ctrl.getNumOfPressedBtns());

		ctrl.pressAll();
		System.out.println(ctrl.getNumOfPressedBtns());

		ctrl.releaseAll();
		System.out.println(ctrl.getNumOfPressedBtns());

	}

}
