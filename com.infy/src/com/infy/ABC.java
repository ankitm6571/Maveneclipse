package com.infy;

class ABC{
	int i;
	ABC (int i){
		System.out.println(i);
		
	}
	public static void main(String args[]){
		ABC obj = new ABC(10);
		System.out.println(obj.i);
	}
}
