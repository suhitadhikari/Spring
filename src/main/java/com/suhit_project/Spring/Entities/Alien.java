package com.suhit_project.Spring.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	
	@Column(name="ALIEN_ID")
	private int aId;
	private String aName;
	private String aColor;
	
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", aColor=" + aColor + "]";
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaColor() {
		return aColor;
	}
	public void setaColor(String aColor) {
		this.aColor = aColor;
	}

}
