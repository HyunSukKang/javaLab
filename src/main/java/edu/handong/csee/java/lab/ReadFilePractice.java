package edu.handong.csee.java.lab;

import java.util.ArrayList;

public class ReadFilePractice {

	public static void main(String[] args) {
		ReadFilePractice rfp = new ReadFilePractice();
		rfp.run();
	}
	
	public void run() {
		ArrayList<String> aList = new ArrayList<String>();
		String a = "Hello,World,Handong,Global,University";
		String[] list = a.split(",");
		
		for(String s : list) aList.add(s);
		int s = aList.size();
		for(int i=0; i<s; i++) System.out.println(aList.get(i));
	}
	
}
