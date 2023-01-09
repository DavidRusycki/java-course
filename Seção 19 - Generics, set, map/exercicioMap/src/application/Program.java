package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		
		try (FileReader fileReader = new FileReader(path);BufferedReader bufferedReader = new BufferedReader(fileReader);) {	
			
			String line = bufferedReader.readLine();
			while(line != null) {
				String[] values = line.split(",");
				
				String name = values[0];
				Integer votos = Integer.parseInt(values[1]);
				
				if (list.containsKey(name)) {
					list.put(name, list.get(name) + votos);
				}
				else {
					list.put(name, votos);
				}
				
				line = bufferedReader.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(String key : list.keySet()) {
			System.out.println(key + ": " + list.get(key));
		}
		
		sc.close();
	}
	
}
