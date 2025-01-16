package com.springcore.constructor;

public class person {

	private String Pname;
	private int Pid;
	private Certificate cert;
	public person(String pname, int pid,Certificate cer) {
	
		Pname = pname;
		Pid = pid;
		cert=cer;
	}

	@Override
	public String toString() {
		return this.Pname+" : "+this.Pid+"{"+this.cert.getName()+"}\n";
	}
	
}
