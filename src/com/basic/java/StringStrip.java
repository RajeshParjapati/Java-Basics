package com.basic.java;

public class StringStrip {
	
	public static void main(String[] args) {
		String str = "</script><svg/onload=alert(document.domain)>";
		String aftStip= stripHTMLAngles(str);
		System.out.println(aftStip);
		
		MyInterface1 myclass = new MyImplClass();
		myclass.m1();
		
		
	}
	
	public static String stripHTMLAngles(String val) {

        if (val == null) {
            return null;
        }
        int len = val.length();
        StringBuffer buf = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            char ch = val.charAt(i);
            if (ch != '<' && ch != '>') {
                buf.append(ch);
            }
        }
        return (buf.toString());
    }

}
