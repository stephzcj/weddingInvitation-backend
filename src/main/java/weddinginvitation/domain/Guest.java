package weddinginvitation.domain;

import java.io.Serializable;

public class Guest implements Serializable{

	private static final long serialVersionUID = 2L;
	
	private String name;
	private int pNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	

}
