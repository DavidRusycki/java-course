import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Operacoes {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.now();
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.now();
		
		// Adiciona semanas
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);		
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);

		// Adiciona anos
		LocalDateTime pastYearLocalDateTime = d05.minusYears(1);
		LocalDateTime nextYearLocalDateTime = d05.plusYears(1);
		
		System.out.println(pastYearLocalDateTime);
		System.out.println(nextYearLocalDateTime);
		
		// Para modificar instant usamos o ChronoUnit.
		Instant pastDayInstant = d06.minus(1, ChronoUnit.DAYS);
		Instant nextDayInstant = d06.plus(1, ChronoUnit.DAYS);

		System.out.println(pastDayInstant);
		System.out.println(nextDayInstant);
		
		Duration t1 = Duration.between(pastDayInstant, nextDayInstant);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());	
		
		System.out.println(t1.toHours());
		System.out.println(t2.toDays());
		
	}
	
}
