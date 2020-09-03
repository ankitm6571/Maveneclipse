package com.infy;

class Customer {

	public void getName(String fname,String lname){
        String name=fname.concat(lname); 
		StringBuilder sb=new StringBuilder(fname);
		sb.append(" ");
	    name=sb.toString();//Line 1
	    System.out.println(name);
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.getName("sam","roy");
	}
}