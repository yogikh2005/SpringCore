package com.springcore.primitive;

public class stud {

	private int studId;
	private String studName;
	private String studAddress;
	@Override
	public String toString() {
		return "stud [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public stud(int studId, String studName, String studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
	}
	public stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
