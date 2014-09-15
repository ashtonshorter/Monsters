package monsters.model;

public class MarshmellowMonster
{
	private String name;
	private double numLegs;
	private double amntHair;
	private int numArms;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyBtn;
	
	public MarshmellowMonster() {
		
	}
	
	public MarshmellowMonster(String name, int eyeCount) {
		this.name = name;
		this.eyeCount = eyeCount;
	}
	
	public MarshmellowMonster(String name, double numLegs, double amntHair, int numArms, int eyeCount, int noseCount, boolean hasBellyBtn) {
		this.name = name;
		this.numLegs = numLegs;
		this.amntHair = amntHair;
		this.numArms = numArms;
		this.eyeCount = eyeCount;
		this.noseCount = noseCount;
		this.hasBellyBtn = hasBellyBtn;
	}
	
	public String GetName() {
		return name;
	}
	
	public double GetNumLegs() {
		return numLegs;
	}
	
	public double GetAmntHair() {
		return amntHair;
	}
	
	public int GetNumArms() {
		return numArms;
	}
	
	public int GetEyeCount() {
		return eyeCount;
	}
	
	public int GetNoseCount() {
		return noseCount;
	}
	
	public boolean HasBellyBtn() {
		return hasBellyBtn;
	}
}
