package dev_tp2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Class1 {

	private static Scanner read;

	public static void main(String[] args) throws IOException {
		
		read = new Scanner(System.in);
		System.out.println("le nomber d'employee :");
		int empNom = read.nextInt();
		
		try {
			FileOutputStream fileOut = new FileOutputStream("emp.dat");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeInt(empNom);
			
			for(int i=0 ; i<empNom ; i++) {
				Employee e = new Employee();
				System.out.print(" name :");
				e.name = read.next();
				System.out.print(" address :");
				e.address = read.next();
				System.out.print(" SSN :");
				e.SSN = read.nextInt();
				System.out.print(" number :");
				e.number = read.nextInt();
				out.writeObject(e);
			}
			out.writeObject(null);
			out.close();
	        fileOut.close();
	        System.out.printf("donnees serialisees sauvegardees dans emp.dat");
		}
		catch(IOException i)
	      {
	          i.printStackTrace();
	      }

	}

}
