package visitor.example.parts;

import visitor.example.actions.Action;

/** 腕 */
public class Arm implements BodyPart {
	
	public void open() {
		System.out.println("open arms.");
	}
	
	public void swing() {
		System.out.println("swing arms.");
	}
	
	public void rest() {
		System.out.println("rest arms.");
	}
	
	@Override
	public void accept(Action action) {
		action.visitArm(this);
	}
}
