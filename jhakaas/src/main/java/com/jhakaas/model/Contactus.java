package com.jhakaas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contactus 
{
	@Column
	String Name;
	@Column
	String Subject;
	@Column
	String Description;
	@Column @Id
	String emailid;

	
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}