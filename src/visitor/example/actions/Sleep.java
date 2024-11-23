package visitor.example.actions;

import java.util.List;

import visitor.example.parts.Arm;
import visitor.example.parts.BodyPart;
import visitor.example.parts.Head;
import visitor.example.parts.Leg;

public class Sleep implements Action {
	
	public void execute(List<BodyPart> bodyParts) {
		
		System.out.println("--- Sleep ---");
		
		for(BodyPart bodypart: bodyParts) {
			bodypart.accept(this);
		}
	}
	
	@Override
	public void visitHead(Head head) {
		head.closeEyes();
	}

	@Override
	public void visitArm(Arm arm) {
		arm.rest();
	}

	@Override
	public void visitLeg(Leg leg) {
		leg.rest();
	}
}
