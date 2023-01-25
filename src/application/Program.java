package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		/*		
		//lendo arquivo
				
			 File file = new File("c:\\temp\\in.txt");
			Scanner sc = null;
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				
			  }
			  catch (IOException e) {
				  System.out.println("Error: " + e.getMessage());
			  }
			  finally {
				  if (sc != null) {
					  sc.close();
				  }
			  }*/
				
		/*
		
		//FileReader / BufferedReader / Bloco try-with-resources
		
		
				String path = "c:\\temp\\in.txt";
				
				
				try(BufferedReader br = new BufferedReader(new FileReader(path))){
					String line = br.readLine();
					
					while (line != null) {
						System.out.println(line);
						line = br.readLine();
					}
					
				}
				catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				} 
				*/
		
		
 	String[] lines = new String[] {"criando string dentro do arquivo", "java", "java"};
		
		String path = "c:\\temp\\out.txt";
		
		     // para nao desfazer acrescentar basta colocar o true- (path, true)
		
		try  (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
		 e.printStackTrace();
		} 
		
	}
}
			
				
		
		