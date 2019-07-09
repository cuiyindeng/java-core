package com.exercise.core.string;

public class StringTest2 {
    public static void main( String[] args )
    {
    	B b = new B("a");
    	m(b);
    	System.out.println(b.getStr());
    	
    }
    
    public static void m(B b) {
		b.setStr("b");
	}
    
}

class B {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public B(String str) {
		super();
		this.str = str;
	}
	
}