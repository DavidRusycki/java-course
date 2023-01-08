package trabalhandoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo .csv: ");
		String path = sc.nextLine();
		
		File sourcefile = new File(path);
		
		String folderPath = sourcefile.getParent();
		
		new File(folderPath + "\\out").mkdir();
		
		File targetFile = new File(folderPath + "\\out\\summary.csv");
		
		try (FileReader fileReader = new FileReader(sourcefile); BufferedReader bufferedReader = new BufferedReader(fileReader); FileWriter fileWriter = new FileWriter(targetFile); BufferedWriter bfileWriter = new BufferedWriter(fileWriter)) {
			String lineContent = bufferedReader.readLine();
			
			while (lineContent != null) {
				String[] itens = lineContent.split(",");	
				Product product = new Product(itens[0], Double.parseDouble(itens[1]), Integer.parseInt(itens[2]));
			
				bfileWriter.write(product.toString());
				bfileWriter.newLine();
				lineContent = bufferedReader.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----Fim----");
		
		sc.close();
	}	
}
