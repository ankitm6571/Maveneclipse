package com.infy;

public class Account {
	public static void main(String args[]){
		Object[] o = new Object[3];//Line 1
		o[0] = 12;//Line 2
		 //Line 3
		try {
		System.out.print(o[8]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			
		}
		}

	}
