package serializable;


import java.io.File;

import java.io.*;

	public class bookrecord {

		public static void main(String[] args) {
			
			
		
			try {
			book b= new book();
			b.getdata();
			
			File fr= new File("book.ser");
			
			//open or create file for writing 
			FileOutputStream f= new FileOutputStream("book.ser",true);
			if(fr.length()<=0)
			{
			ObjectOutputStream o= new ObjectOutputStream(f);
			o.writeObject(b);
			}
			else
			{
				bookOutputStream bo=new bookOutputStream(f);
				bo.writeObject(b);
			}
			
	ObjectInputStream i= new ObjectInputStream(new FileInputStream("book.ser"));
	int count=0;
			do
			{
				b=(book) i.readObject();
				 count++;
				b.display();
			}while(b!=null);
			b.countdata(count);		
			}catch(Exception e) {}}}
			
		

