package com.myzee.immutable;

public class ImmutableWithClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address a = new Address(111, "bangalore");
		Employee e = new Employee(001, "nagaraj", a);
		System.out.println(e);
		Address a1 = (Address) a.clone();
		a1.id = 222;;
		a = a1;
		System.out.println(e);
	}
}

final class Employee {
	private final int id;
	private final String name;
	private final Address addr;
	
	public Employee(int id, String name, Address addr) throws CloneNotSupportedException {
		this.id = id;
		this.name = name;
		this.addr = (Address)addr.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddr() {
		return addr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "employee : " + this.id + ", " + this.name + "\nAddress : " + addr;
	}
	
}

class Address implements Cloneable {
	int id;
	String street;
	
	public Address(int id, String street) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.street = street;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.street;
	}
}
