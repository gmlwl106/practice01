package com.javaex.practice01;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2; //계산 후 i는 1증가
		
		System.out.println(i); //11
		System.out.println(n); //0
	}
}
