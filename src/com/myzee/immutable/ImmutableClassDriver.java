package com.myzee.immutable;

public class ImmutableClassDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Worker w = new Worker(12, "nagaraj", "npattar@gmail.com");
		System.out.println(w.toString());	
		
		Worker w1 = (Worker) w.clone();
		System.out.println(w1);
	}
}

final class Worker implements Cloneable{
	private final int id;
	private final String name;
	private final String email;
	
	public Worker(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.email; 
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
