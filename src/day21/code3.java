package com.destination.jfs.day21;
class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//specific setters
	void setName(String name) {
		this.name=name;
		}
	void setcolor(String color) {
	this.color=color;
	
	}
	 void setcost(int cost) {
		 this.cost=cost;
	 }
	 void setAge(int age) {
		 this.age=age;
	 }
	 void setbreed(String breed) {
		 this.breed=breed;
	 }
	 // specific getters
	 String getName() {
		 return name;
		 
	 }
	 String getcolor() {
		 return color;
		 
	 }
	 int getAge() {
		 return age;
	 }
	 int getcost() {
		 return cost;
	 }
	 String getbreed() {
		 return breed;
	 }
	 void setData1(String name,String color,int age,int cost,String breed) {
		 setName(name);
		 setcolor(color);
		 setcost(cost);
		 setbreed(breed);
		 setAge(age);
		 
		 this.name=name;
		 this.color=color;
		 this.breed=breed;
		 this.cost=cost;
		 this.age=age;
		 }
	 void getData1() {
		 System.out.println(getName());
		 System.out.println(getcolor());
		 System.out.println(getbreed());
		 System.out.println(getAge());
		 System.out.println(getcost());
	 }
	 void getData2() {
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(breed);
		 System.out.println(age);
		 System.out.println(cost);
	 }
		 
	void setData2(String name,String color,int age,int cost,String breed) {
	
		 
	 }
	 }

public class code3 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("jimmy");
		d.setcolor("brown");
		d.setbreed("pug");
		d.setAge(4);
		d.setcost(5000);
		
		System.out.println(d.getName());
		System.out.println(d.getcolor());
		System.out.println(d.getbreed());
		System.out.println(d.getAge());
		System.out.println(d.getcost());
		
		System.out.println("============");
		Dog d1 = new Dog();
		d1.setData1("rocky", "white", 6, 7000, "gr");
		d1.getData1();
		
		System.out.println("==========");
		Dog d2 = new Dog();
		d2.setName("jimmy");
		d2.setcost(5000);
		
		System.out.println(d2.getName());
		System.out.println(d2.getcolor());
		System.out.println(d2.getbreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getcost());
		
			
		
	}

}
