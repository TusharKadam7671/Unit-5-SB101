package com.question1;

public class Tiger extends Animal{

	Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() throws AnimalException {
		// TODO Auto-generated method stub
		
		System.out.println("Tiget is eating !!");
		
	}
	
	public static void main(String[] args) {
		
		try {
			Animal tiger = new Tiger();
			tiger.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

}
