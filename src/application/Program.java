package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


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
		
		
		
		/*Criar/recriar arquivo- new FileWriter(path)
		 * Acrescenta ao arquivo existente- new FileWriter(path,true)
		 * BufferedWriter(mais rapido)
		 */
		
	/*
		
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
		*/
		
		

		// Manipulando pastas com File
				
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a folder path: ");
				String strPath = sc.nextLine();
				
				File path = new File(strPath);
				
				  //Impreme um array com as pastas do diretorio
				
				File[] folders = path.listFiles(File::isDirectory);
				System.out.println("FOLDERS:");
				for (File folder : folders) {
					System.out.println(folder);
				}
				
		
		
	}
}
			
				
		
		