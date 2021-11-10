import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Class3 {
	
	private static Scanner read;

	public static void main(String[] args) throws EOFException {
		Employee em = new Employee();
		read = new Scanner(System.in);
		System.out.println("le numéro d'employee :");
		int employeenuméro = read.nextInt();
		
		try {
			 RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
			 
			 int number = raf.readInt();
			 
			 for (int i =0 ; i<number ;i++) {
				 
				 em.read(raf);
				
				 if(em.number == employeenuméro) {
					 System.out.println(em.name);
			         System.out.println(em.address);
			         System.out.println(em.SSN);
			         System.out.println(em.number);
			         break ;
				 }
				 if(i == number-1) {
					 System.out.printf("employee not found");
				 }
				 
	         }
			 
			
			 raf.close();
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
