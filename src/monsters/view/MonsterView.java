package monsters.view;
import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;
import monsters.model.MarshmellowMonster;
public class MonsterView
{
	public String answer;
	public MarshmellowMonster abrev;
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController) {
		this.baseController = baseController;
	}
	
	public void DisplayInformation() {
		abrev = baseController.GetMonster();
		JOptionPane.showMessageDialog(null, "I made a monster, its name is: " + abrev.GetName());
		JOptionPane.showMessageDialog(null, "It has: " + (int)abrev.GetNumLegs() + " legs");
		JOptionPane.showMessageDialog(null, "It has: " + (int)abrev.GetNumArms() + " arms");
		JOptionPane.showMessageDialog(null, "It has: " + (int)abrev.GetAmntHair() + " hairs");
		JOptionPane.showMessageDialog(null, "It has: " + abrev.GetEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null, "It has: " + abrev.GetNoseCount() + " nose");
		
		if(abrev.HasBellyBtn() == true)
			answer = "Of Course it does!";
		else
			answer = "Nope";
		
		JOptionPane.showMessageDialog(null, "And finally, does it have a belly button?: " + answer);
	}
}
