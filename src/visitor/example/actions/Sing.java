package visitor.example.actions;

import java.util.List;

import visitor.example.parts.Arm;
import visitor.example.parts.BodyPart;
import visitor.example.parts.Head;
import visitor.example.parts.Leg;

public class Sing implements Action {
	
	public void execute(List<BodyPart> bodyParts) {
		
		System.out.println("--- Sing ---");
		
		for(BodyPart bodypart: bodyParts) {
			bodypart.accept(this);
		}
	}
	
	@Override
	public void visitHead(Head head) {
		head.sing();
	}

	@Override
	public void visitArm(Arm arm) {
		arm.open();
	}

	@Override
	public void visitLeg(Leg leg) {
		leg.stand();
	}
}
