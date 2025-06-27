import java.util.Scanner;



class Person{
	
	private String name;
	private String address;
	
	public Person() {
		count++;
	}
	
	static {
		count=0;
	}
	
	private static int count ; // class level property
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("in parent class");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
class Trainee extends Person{	
	
	
	private int traineeId;  // instance variables
	
	
	public int getTraineeId() {
		return traineeId;
	}
	
	public void setName(String name) { // method overriding
		super.setName(name);
		System.out.println("in child class");
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	
	public Trainee(){ // default constructor
		System.out.println("inside constructor");
		
	}
	public Trainee(int id){ // parametrized constructor
		System.out.println("inside constructor");
		traineeId= id;
		
	}
	public Trainee(int id, String name){
		System.out.println("inside constructor");
		traineeId= id;
		
	}
	public Trainee( String name, int id){
		System.out.println("inside constructor");
		traineeId= id;
		
	}// constructor overloading
	public void getDetails(){ //methods
		System.out.println("display details of trainee "+ traineeId );	
	}
	public int getDetails(int a){ //methods
		System.out.println("display details of trainee "+ traineeId );	
		return 0;
	}
	private static String displayName(int traineeId, Trainee[] arr) {
		String name=null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				if(traineeId== arr[i].traineeId) {
					//name= arr[i].name;
					break;
				}
			}
		}
		return name;
	}
}

public class TrianeeDemo {		
	
	
	public static void addition(int... a) {// varargs
		
	}
	static int[][] game = new int[6][6];

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		
		Person p= new Person();
		System.out.println(Person.getCount());
		Person p1= new Person();
		System.out.println(Person.getCount());
		Person p2= new Person();
		System.out.println(Person.getCount());
		Person p3= new Person();
		System.out.println(Person.getCount());
				
		Trainee[] a1= new Trainee[10];
	
		Trainee t1 = new Trainee(10);
		t1.setName("544554");
		t1.getDetails();
		System.out.println(t1);
		Trainee t2 = new Trainee();
		t2.getDetails();
		t2.setTraineeId(101);
		t2.setName("Kavita");
		System.out.println(t2);
		Trainee t3 = new Trainee();
		t3.getDetails();
		System.out.println(t3);	

	}

}
