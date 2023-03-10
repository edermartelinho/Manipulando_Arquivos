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
		 * //lendo arquivo
		 * 
		 * File file = new File("c:\\temp\\in.txt"); Scanner sc = null; try { sc = new
		 * Scanner(file); while (sc.hasNextLine()) { System.out.println(sc.nextLine());
		 * }
		 * 
		 * } catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 * finally { if (sc != null) { sc.close(); } }
		 */

		/*
		 * 
		 * //FileReader / BufferedReader / Bloco try-with-resources
		 * 
		 * 
		 * String path = "c:\\temp\\in.txt";
		 * 
		 * 
		 * try(BufferedReader br = new BufferedReader(new FileReader(path))){ String
		 * line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); }
		 * 
		 * } catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 */

		/*
		 * Criar/recriar arquivo- new FileWriter(path) Acrescenta ao arquivo existente-
		 * new FileWriter(path,true) BufferedWriter(mais rapido)
		 */

		/*
		 * 
		 * String[] lines = new String[] {"criando string dentro do arquivo", "java",
		 * "java"};
		 * 
		 * String path = "c:\\temp\\out.txt";
		 * 
		 * // para nao desfazer acrescentar basta colocar o true- (path, true)
		 * 
		 * try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ for
		 * (String line : lines) { bw.write(line); bw.newLine(); } } catch (IOException
		 * e) { e.printStackTrace(); }
		 */
		
		/*

		// Manipulando pastas com File

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Impreme um array com as pastas do diretorio

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
			
		}
		
		
		  // Criando uma subpasta apartir da pasta temp
		
		
		
		boolean created = new File(strPath + "O nome que quiser").mkdir();
		System.out.println("Directory created successfully: " + created);
				
		sc.close();
		
		*/
		
		  // Infomacoes do caminho do arquivo
		
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a file path: ");
				String strPath = sc.nextLine();
				
				File path = new File(strPath);
				
				System.out.println("getPath: " + path.getPath());
				System.out.println("getParent: " + path.getParent());
				System.out.println("getName: " + path.getName());
				
				sc.close();
		         
		

	}
}
