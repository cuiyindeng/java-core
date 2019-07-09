package com.exercise.core.string;

import java.nio.charset.Charset;

/**
 * 测试StringBuilder和StringBuffer的线程安全
 * 
 * @author cuiyindeng
 *
 */
public class StringTest1 {
    public static void main( String[] args )
    {
    	StringBuilder str = new StringBuilder();
    	StringBuffer str1 = new StringBuffer();
    	A a = new A(str, str1);
        for (int i = 0; i < 20; i++) {
			new Thread(a).start();
		}
    }
}

class A implements Runnable {

	StringBuilder stringBuilder;
	StringBuffer stringBuffer;
	
	A(StringBuilder str, StringBuffer str1) {
		this.stringBuilder = str;
		this.stringBuffer = str1;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			stringBuilder.append('c');
			stringBuffer.append('c');
			
			try {
		        Thread.sleep(10);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		}
		//stringBuilder的长度总是小于200，说明线程不安全。
		System.out.println("stringBuilder: " + stringBuilder.length());
		//stringBuilder的长度总是等于200，说明每个线程累加10次，是线程安全的。
		System.out.println("stringBuffer: " + stringBuffer.length());
	}
	
}
