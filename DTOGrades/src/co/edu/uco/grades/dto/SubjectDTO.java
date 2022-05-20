package co.edu.uco.grades.dto;

import co.edu.uco.crosscutting.util.text.UtilText;

public class SubjectDTO {
	
	private int id;
	private String name;
	
	
	public SubjectDTO() {
		setId (id);
		setName (UtilText.EMPTY);
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	

}
