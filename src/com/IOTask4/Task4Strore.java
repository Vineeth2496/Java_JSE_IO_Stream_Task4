package com.IOTask4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

public class Task4Strore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		cinema c=new cinema(3, "RRR", 450.00f, "Ammerpet");
		//c.Movie();
		//System.out.println(c.toString());
		cinema c1=new cinema(4, "KGF", 660.00f, "SR nagar");
		//c1.Movie();
		//System.out.println(c1.toString());
		cinema c2=new cinema(2, "MAJOR", 300.00f, "Mehdpatnam");
		//c2.Movie();
		FileOutputStream fo=new FileOutputStream("Task4.ser");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		TreeMap ts=new TreeMap();
		ts.put(1, c);
		ts.put(2, c1);
		ts.put(3, c2);
		oo.writeObject(ts);
		}
		catch (Exception ts) {
			// TODO: handle exception
			ts.printStackTrace();
		}
	}

}
