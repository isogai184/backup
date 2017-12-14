package com.human;

public class HumanName {

	public String SEI;
	private String MEI;

	public HumanName() {
		SEI = "磯貝";
		MEI = "智樹";
	}
	public HumanName(String SEI, String MEI) {
		this.SEI = SEI;
		this.MEI = MEI;
	}

	public String getName() {
		return SEI + MEI;
	}
	public String getMEI() {
		return MEI;
	}
}
