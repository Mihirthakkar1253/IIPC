package IIPC_java;
/*Write a program using constructor that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name         Year of joining                         Address
Robert            1994                                    64C- WallsStreet
Sam                2000                                     68D- WallsStreet
John                1999                                     26B- WallsStreet*/

public class example6 {
	public static void main(String[]args) {
		employee e1=new employee();
		employee e2=new employee("Robert",1994 ,"  64C- WallsStreet");
		employee e3=new employee("Sam ", 2000     ,"    68D- WallsStreet");
		employee e4=new employee("John",1999 ,"  26B- WallsStreet");
	}

}
class employee{
	String name;
	int year;
	String Address;
	employee(){
		System.out.println("Name"+"   "+"year of joining"+"                "+"Address");	}
	employee(String Name,int year,String add){
		this.name=Name;
		this.year=year;
		this.Address=add;
		System.out.println(name+"       "+year+"                 "+Address);
	}
}
