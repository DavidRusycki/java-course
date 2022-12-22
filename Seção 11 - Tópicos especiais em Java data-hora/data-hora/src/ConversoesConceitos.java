import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ConversoesConceitos {

	public static void main(String[] args) {
		// Formato ISO 8601 - 2022-07-29T14:52:09.4040
		
		// Agora
				
		// Data hora Local - Ou seja sem fuso horário.
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		
		// Data hora global - Ou seja com fuso horário. Possui Z no final.
		Instant d03 = Instant.now();
		
		// Criando um objeto de data a partir de uma String no padrão ISO 8601
		// Data local
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:20");
		// Data global
		Instant d06 = Instant.parse("2022-07-20T05:30:20Z");
		// Criando data global a partir de uma data local indicando quanto estamos adiantado ou atraso em relação ao horário de londres
		// Percebi que funciona somente no Java 17 no 11 não rodou.
		Instant d07 = Instant.parse("2022-07-20T01:30:20-01:00");

		
		// Não é possível converter diretamente datas no formato diferente do padrão AAAA/MM/DD, para isso usamos o DateTimeFormatter, que possibilita dizer ao programa como a nossa data está formatada.
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		// Akie peguei uma data local e converti ela para instant dizendo que estamos com -3 horas em relação a londres.
		System.out.println("Horário de londres: "+d09.toInstant(ZoneOffset.ofHours(-3)));
		
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		// Converter local para global é só utilizar o método toInstant e dizer quantas horas tem de diferença entre os fusos.
		// Converter global para local.
		System.out.println("Global para local: "+LocalDateTime.ofInstant(d06, ZoneOffset.ofHours(-3)));
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		
		
		System.out.println("Transformando objetos para texto.");
		
		LocalDate d21 = LocalDate.now();
		LocalDateTime d22 = LocalDateTime.now();
		Instant d23 = Instant.now();
		
		//Formatando data local para data qualquer formato
		DateTimeFormatter fmt21 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Formatando data local para data qualquer formato com hora
		DateTimeFormatter fmt22 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Formatando data global para qualquer formato porém de uma forma diferente pois é necessário indicar qual o ZoneId que estamos.
		DateTimeFormatter fmt23 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt24 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneOffset.ofHours(-2));
		
		System.out.println(d21.format(fmt21));
		System.out.println(d22.format(fmt22));
		System.out.println(fmt23.format(d23));
		System.out.println(fmt24.format(d23));
		

		System.out.println("Convertendo Datas");
		
		
		LocalDate d31 = LocalDate.now();
		LocalDateTime d32 = LocalDateTime.now();
		Instant d33 = Instant.now();
		
		LocalDate r1 = LocalDate.ofInstant(d33, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d33, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d33, ZoneId.of("Portugal"));
		
		
		// Conversão de global para alguma outra, seja portugal, default do sistema etc.
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		// Acessando propriedades 
		System.out.println("Dia: "+ d32.getDayOfMonth());
		System.out.println("Mês: "+ d32.getMonthValue());
		System.out.println("Mês: "+ d32.getMonth());
		System.out.println("Ano: "+ d32.getYear());
		
	}

}
