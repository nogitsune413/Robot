package visitor.example.parts;

import visitor.example.actions.Action;

public interface BodyPart {
	
	void accept(Action action);
}
