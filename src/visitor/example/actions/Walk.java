package visitor.example.actions;

import java.util.List;

import visitor.example.parts.Arm;
import visitor.example.parts.BodyPart;
import visitor.example.parts.Head;
import visitor.example.parts.Leg;

public class Walk implements Action {
	
	public void execute(List<BodyPart> bodyParts) {
		
		System.out.println("--- Walk ---");
		
		for(BodyPart bodypart: bodyParts) {
			bodypart.accept(this);
		}
	}
	
	@Override
	public void visitHead(Head head) {
		head.lookAhead();
	}

	@Override
	public void visitArm(Arm arm) {
		arm.swing();
	}

	@Override
	public void visitLeg(Leg leg) {
		leg.walk();
	}
}
