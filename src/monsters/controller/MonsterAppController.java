package monsters.controller;
import monsters.view.MonsterView;
import monsters.model.MarshmellowMonster;
public class MonsterAppController
{
	private MonsterView appView;
	private MarshmellowMonster myMonster;
	
	public MonsterAppController() {
		appView = new MonsterView(this);
		myMonster = new MarshmellowMonster("Squiggles", 3);
		myMonster = new MarshmellowMonster("Squiggles", 2.0, 4.0, 4, 2, 1, true);
	}
	
	public void start() {
		appView.DisplayInformation();
	}
	
	public MarshmellowMonster GetMonster() {
		return myMonster;
	}
	
}
