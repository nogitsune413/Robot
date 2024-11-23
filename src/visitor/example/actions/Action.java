package visitor.example.actions;

import java.util.List;

import visitor.example.parts.Arm;
import visitor.example.parts.BodyPart;
import visitor.example.parts.Head;
import visitor.example.parts.Leg;

public interface Action {
	
	void execute(List<BodyPart> bodyParts);
	
	void visitHead(Head head);

	void visitArm(Arm arm);

	void visitLeg(Leg leg);
}
