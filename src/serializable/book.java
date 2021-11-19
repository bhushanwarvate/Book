package serializable;


	import java.io.*;
	import java.util.Scanner;
	//marker interface --> empty interface
	public class book implements Serializable 
	{
	String bname;
	String aname;
	int price ;

	void getdata()
	{
		Scanner s= new Scanner(System.in);
	    System.out.println("enter book name author name and price");
	    bname=s.next();
	    aname=s.next();
	    price=s.nextInt();
	}
	void countdata(int y)
	{
		System.out.println("total records read ="+y);
	}
	void display()
	 {
	  System.out.println(bname+ "   "+ aname+"  "+price);	
	 }
	void count() {}

	}

