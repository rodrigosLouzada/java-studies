package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Program_Time {

	public static void main(String[] args) {
		// quando obtemos diretamente as datas e em seus diversos formatos
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		// quando a partir de uma String(como em json) transformamos no padrão que queremos
		LocalDate d4 = LocalDate.parse("2025-01-12");
		LocalDateTime d5 = LocalDateTime.parse("2025-01-12T01:30:26");
		Instant d6 = Instant.parse("2025-01-12T01:30:26Z");
		Instant d7 = Instant.parse("2025-01-12T01:30:26-03:00");
		
		/* é necessário para instanciar e imprimir fora do padrão ISO, 
		aceitando sobrecarda que seja ob dateFormatter */
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// qualquer formato que queremos imprimir, deve ser passado pelo padrão antes em Format:
		LocalDate d8 = LocalDate.parse("12/02/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate d81 = LocalDate.parse("12/02/2025", form);

		LocalDate d9 = LocalDate.parse("12/02/2025 12:30", form2);
		
		// ou utilizar valores diretos pelo metodo OF de cada um , no formato iso :
		LocalDate d10 = LocalDate.of(2024, 5, 12);
		LocalDateTime d11 = LocalDateTime.of(2024, 5, 12, 1, 33);
		
		System.out.println(d1 + "---" + d2);
		System.out.println(d8);
		System.out.println(d9);
	}

}
