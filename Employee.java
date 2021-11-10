package dev_tp2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Employee implements Serializable{

	   public String name;
	   public String address;
	   public  int SSN;
	   public int number;
	   
	   void write(RandomAccessFile ref) throws IOException {

		   StringBuffer stringBuffer ;
		   
		   stringBuffer = new StringBuffer(name);
		   ref.writeUTF(stringBuffer.toString());
		   
		   stringBuffer = new StringBuffer(address);
		   ref.writeUTF(stringBuffer.toString());
		   
		   ref.writeInt(SSN);
		   ref.writeInt(number);
		   
		
	   }

	   void read (RandomAccessFile ref) throws IOException {
		 
		   name = ref.readUTF();
		   address = ref.readUTF();  
		   SSN = ref.readInt();
		   number = ref.readInt();
		   
	   }
}
