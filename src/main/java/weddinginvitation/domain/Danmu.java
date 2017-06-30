package weddinginvitation.domain;

import java.io.Serializable;

public class Danmu implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String context;
	private String createdDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
}
