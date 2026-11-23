package com.multipleobjectofthesameclass;

public class Employee {

	int eid;
	String name;
	double salary;
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.eid = 29;
		e.name="Sakshi";
		e.salary=900000;
		System.out.println(e.eid+" "+e.name+" "+e.salary);
		
		Employee e1 = new Employee();
		e1.eid=13;
		e1.name ="Harshal";
		e1.salary = 800000;
		System.out.println(e1.eid+" "+e1.name+" "+e1.salary);
		
		Employee e2 = new Employee();
		e2.eid=7;
		e2.name ="Akshada";
		e2.salary = 700000;
		System.out.println(e2.eid+" "+e2.name+" "+e2.salary);
	}
	
}
