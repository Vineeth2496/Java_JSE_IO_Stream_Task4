
package com.IOTask4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IOTask4Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fi=new FileInputStream("Task4.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		TreeMap ts=(TreeMap)oi.readObject();
				
		Set s=ts.entrySet();
		Iterator i=s.iterator();
		for(;i.hasNext();)
		{
			System.out.println(i.next()) ;			
		}
		//Object o=i.next();
		//o=(cinema)oi.readObject();
		
		
		/*
		cinema c=(cinema)oi.readObject();
		cinema c1=(cinema)oi.readObject();
		cinema c2=(cinema)oi.readObject();
		c.Movie();
		c1.Movie();
		c2.Movie();
		*/
		}
		catch (Exception ts) {
			// TODO: handle exception
			ts.printStackTrace();
		}
		
	}

}
