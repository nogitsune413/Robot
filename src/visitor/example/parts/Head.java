package visitor.example.parts;

import visitor.example.actions.Action;

/** 頭 */
public class Head implements BodyPart {

	public void openEyes() {
		System.out.println("open eyes.");
	}
	
	public void closeEyes() {
		System.out.println("close eyes.");
	}
	
	public void lookAhead() {
		System.out.println("look ahead.");
	}

	public void sing() {
		System.out.println("sing a song.");
	}

	@Override
	public void accept(Action action) {
		action.visitHead(this);
	}
}
