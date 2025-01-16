package com.springcore.collection;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Emp {
	
	private String EmpName;
	private List<String>EmpPhones;
	private Set<String>EmpAddress;
	private Map<String,String>EmpCoruse;
	private Properties DB;
	
	
	public Properties getDB() {
		return DB;
	}
	public void setDB(Properties dB) {
		DB = dB;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getEmpPhones() {
		return EmpPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		EmpPhones = empPhones;
	}
	public Set<String> getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		EmpAddress = empAddress;
	}
	public Map<String, String> getEmpCoruse() {
		return EmpCoruse;
	}
	public void setEmpCoruse(Map<String, String> empCoruse) {
		EmpCoruse = empCoruse;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String empName, List<String> empPhones, Set<String> empAddress, Map<String, String> empCoruse,
			Properties dB) {
		super();
		EmpName = empName;
		EmpPhones = empPhones;
		EmpAddress = empAddress;
		EmpCoruse = empCoruse;
		DB = dB;
	}
	
	
	

}
