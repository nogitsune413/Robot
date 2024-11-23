package visitor.example.parts;

import visitor.example.actions.Action;

/** 足 */
public class Leg implements BodyPart {

	public void stand() {
		System.out.println("stand up.");
	}
	
	public void walk() {
		System.out.println("walk.");
	}
	
	public void rest() {
		System.out.println("rest legs.");
	}
	
	@Override
	public void accept(Action action) {
		action.visitLeg(this);
	}
}
