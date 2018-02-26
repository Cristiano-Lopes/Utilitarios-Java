
package teste;

import java.util.Calendar;
import java.util.Date;


public class Teste {

	public static void main(String[] args) {
		Calendar dataInicial = Calendar.getInstance();
		Date dataAtual = new Date();
		dataInicial.set(2018, Calendar.MARCH, 14);

		Calendar cal = Calendar.getInstance();
		cal.setTime(dataAtual);

		Long diferencaDias = dataInicial.getTimeInMillis() - dataAtual.getTime();
		Integer tempoDia = 1000 * 60 * 60 * 24;
		Long diasDiferenca = diferencaDias / tempoDia;
		System.out.println("A Diferença de Dias é igual a " + diasDiferenca);

		if (diasDiferenca == 30) {
			System.out.println(30);
		}
		if (diasDiferenca == 15) {
			System.out.println(15);
		}
		if (diasDiferenca == 5) {
			System.out.println(5);
		}
		if (diasDiferenca == 1) {
			System.out.println("Vespera");
		}

		
	}

}
