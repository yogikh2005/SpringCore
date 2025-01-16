package com.springcore.ref;

public class A {
	private B bobj;
private int x;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public A() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "A [bobj=" + bobj + ", x=" + x + "]";
}

public B getBobj() {
	return bobj;
}

public void setBobj(B bobj) {
	this.bobj = bobj;
}

}
