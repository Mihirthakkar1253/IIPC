package IIPC_java;
//Write a program to take 3 values from user and find addition and average of these values and grade them like if avg marks>90 then A , between 80 to 90 then B, between 70 to 80 then C otherwise D

import java.util.*;
public class Grade {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
	double avg=0;
	int sum=n1+n2+n3;
      avg=sum/3;
      if(avg>90) {
    	  System.out.println("A Grade");
    	 
      }
      else if(avg>80&&avg<=90) {
    	  System.out.println("B Grade");
    	  
      }
      else if(avg>70&&avg<=80) {
    	  System.out.println("C Grade");
      }
      else {
    	  System.out.println("D Grade");
      }
	

}
}
