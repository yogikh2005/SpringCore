package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String>friends;
	private Map<String,Integer>fee;
	private Properties db;
	
	public Properties getDb() {
		return db;
	}
	public void setDb(Properties db) {
		this.db = db;
	}
	
	@Override
	public String toString() {
		return "person [friends=" + friends + ", fee=" + fee + "]";
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFee() {
		return fee;
	}
	public void setFee(Map<String, Integer> fee) {
		this.fee = fee;
	}


	
	
}
