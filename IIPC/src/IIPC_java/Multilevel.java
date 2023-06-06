package IIPC_java;

public class Multilevel {
	public static void main(String[]args) {
		manager m1=new manager("xyz",20,82382,"87787","xyz","abx","xy");
		m1.printsalary();
	}

}
class Member{
	String name;
	int age;
	long salary;
	String phoneno;
	String address;
	Member(){
		
	}
	
	
}
class employee extends Member{
	String specialization;
	
	
	employee(){
		
	}
	employee(String name,int age,long salary,String phoneno,String address,String spe,String sp,String dep){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.phoneno=phoneno;
		this.address=address;
		this.specialization=spe;
		
	}
	
	
	
	public void printsalary() {
		System.out.println(this.name+" "+this.age+" "+this.salary);
	}
}
class manager extends employee{
	String Department;
	manager(String name,int age,long salary,String phoneno,String address,String spe,String dep){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.phoneno=phoneno;
		this.address=address;
		this.specialization=spe;
		this.Department=dep;
	}
	
	public void printsalary() {
		System.out.println(this.name+" "+this.age+" "+this.salary+" "+this.Department);
	}
	
}
