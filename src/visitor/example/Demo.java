package visitor.example;

import java.util.ArrayList;
import java.util.List;

import visitor.example.actions.Sing;
import visitor.example.actions.SingingWalk;
import visitor.example.actions.Sleep;
import visitor.example.actions.Walk;
import visitor.example.parts.Arm;
import visitor.example.parts.BodyPart;
import visitor.example.parts.Head;
import visitor.example.parts.Leg;

public class Demo {
	
	/** エントリーポイント */
	public static void main(String[] args)
	{
		List<BodyPart> bodyparts = new ArrayList<>();
		bodyparts.add(new Head());
		bodyparts.add(new Arm());
		bodyparts.add(new Leg());
		
		new Walk().execute(bodyparts);
		new Sing().execute(bodyparts);
		new Sleep().execute(bodyparts);
		new SingingWalk().execute(bodyparts); // 歌いつつ歩く指示を追加
	}
}
