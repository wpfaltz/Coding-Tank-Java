/*O programa deve:

. 	pedir que o usu�rio digite a quantidade de temperaturas a serem transformadas.

. 	pedir que o usu�rio escolha duas unidades de temperatura. A unidade de origem da temperatura
	e a unidade a ser transformada.

. 	conseguir transformar temperatura em Celsius, Kelvin e Fahrenheit a partir de qualquer uma dessas
	unidades para qualquer uma dessas unidades.. 

. 	imprimir cada temperatura passada, e a unidade escolhida, e tamb�m a temperatura resultante, transformada,
	com sua respectiva unidade.

. 	calcular a m�dia das temperaturas iniciais e transformadas.

. 	ser capaz de se recuperar e tratar qualquer erro que venha ocorrer em sua execu��o.
	Entrega via GITHUB durante a aula de segunda. N�o precisa ser tudo na mesma classe.

*/

package Prova;

import java.util.Scanner;

public class ConversorTemperaturas {
	// Definindo as poss�veis mudan�as de temperatura
	public static double CelsiusToKelvin(double C) {
		double K = C + 273.15;
		return K;
	}

	public static double CelsiusToFahrenheit(double C) {
		double F = (C * 9.0 / 5.0) + 32.0;
		return F;
	}

	public static double KelvinToFahrenheit(double K) {
		double F = ((K - 273.15) * 9.0 / 5.0) + 32.0;
		return F;
	}

	public static double KelvinToCelsius(double K) {
		double C = K - 273.15;
		return C;
	}

	public static double FahrenheitToCelsius(double F) {
		double C = (F - 32.0) * 5.0 / 9.0;
		return C;
	}

	public static double FahrenheitToKelvin(double F) {
		double K = ((F - 32.0) * 5.0 / 9.0) + 273.15;
		return K;
	}

	public static double CelsiusToCelsius(double C) {
		return C;
	}

	public static double KelvinToKelvin(double K) {
		return K;
	}

	public static double FahrenheitToFahrenheit(double F) {
		return F;
	}

	public static double getMedia(double[] array) {
		double media;
		double soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		media = soma / array.length;
		return media;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Quantidade de temperaturas a serem convertidas
		System.out.println("Insira a quantidade de temperaturas diferentes que gostaria de converter: ");
		int qtdTemperaturas = input.nextInt();

		//Unidade da temperatura de origem
		System.out.println("Qual a unidade de temperatura das temperaturas que gostaria de converter?\n"
							+ "1) Celsius\n"
							+ "2) Fahrenheit\n"
							+ "3) Kelvin");
		int codUnidadeOrigem = input.nextInt();
		
		//Unidade da temperatura objetivo
		System.out.println("Qual a unidade de temperatura para a qual gostaria de converter as temperaturas informadas?\n" 
							+ "1) Celsius\n" 
							+ "2) Fahrenheit\n" 
							+ "3) Kelvin");
		int codUnidadeObjetivo = input.nextInt();

		// Inicializando os arrays que guardar�o as temperaturas e inicializando as strings que representar�o as unidades
		double[] TemperaturasIniciais = new double[qtdTemperaturas];
		double[] TemperaturasFinais = new double[qtdTemperaturas];
		String UnidadeInicial = "";
		String UnidadeFinal = "";
		
		// Pedir ao usu�rio as temperaturas a serem convertidas
		for (int i = 0; i < qtdTemperaturas; i++) {
			System.out.printf("Insira a temperatura %d a ser convertida: ", i + 1);
			TemperaturasIniciais[i] = input.nextDouble();
		}
		
		// Combina��es poss�veis unidade de origem - unidade de destino
		// Caso das Temperaturas Iniciais em Celsius
		if (codUnidadeOrigem == 1) {
			if (codUnidadeObjetivo == 1) { // Final em Celsius
				UnidadeInicial = "�C"; 
				UnidadeFinal = "�C";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = CelsiusToCelsius(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 2) {//Final em Fahrenheit
				UnidadeInicial = "�C"; 
				UnidadeFinal = "�F";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = CelsiusToFahrenheit(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 3) {//Final em Kelvin
				UnidadeInicial = "�C"; 
				UnidadeFinal = "K";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = CelsiusToKelvin(TemperaturasIniciais[i]);
				}
			}
			else {
				
			}
				
		}
		//Caso das temperaturas iniciais em Fahrenheit
		else if (codUnidadeOrigem == 2) {
			if (codUnidadeObjetivo == 1) { // Final em Celsius
				UnidadeInicial = "�F"; 
				UnidadeFinal = "�C";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = FahrenheitToCelsius(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 2) {//Final em Fahrenheit
				UnidadeInicial = "�F"; 
				UnidadeFinal = "�F";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = FahrenheitToFahrenheit(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 3) {//Final em Kelvin
				UnidadeInicial = "�F"; 
				UnidadeFinal = "K";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = FahrenheitToKelvin(TemperaturasIniciais[i]);
				}
			}
			else {
				
			}
		
		}
		
		//Caso das temperaturas iniciais em Kelvin
		else if (codUnidadeOrigem == 3) {
			if (codUnidadeObjetivo == 1) { // Final em Celsius
				UnidadeInicial = "K"; 
				UnidadeFinal = "�C";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = KelvinToCelsius(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 2) {//Final em Fahrenheit
				UnidadeInicial = "K"; 
				UnidadeFinal = "�F";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = KelvinToFahrenheit(TemperaturasIniciais[i]);
				}
			}
			else if (codUnidadeObjetivo == 3) {//Final em Kelvin
				UnidadeInicial = "K"; 
				UnidadeFinal = "K";
				for(int i = 0; i<qtdTemperaturas; i++) {
					TemperaturasFinais[i] = KelvinToKelvin(TemperaturasIniciais[i]);
				}
			}
			else {
				
			}
			
		}
		else {
			
		}

		// Imprimir as temperaturas passadas pelo usu�rio com a unidade escolhida
		System.out.println("\nAs temperaturas que voc� escolheu para serem convertidas foram: ");
		for(int i = 0;i<qtdTemperaturas;i++) {
			System.out.printf("%.2f%s\n", TemperaturasIniciais[i], UnidadeInicial);
		}
		
		// Imprimir a m�dia das temperaturas passadas pelo usu�rio;
		double mediaInicial = getMedia(TemperaturasIniciais);
		System.out.printf("\nA m�dia das temperaturas iniciais inseridas � %.2f%s\n", mediaInicial, UnidadeInicial);
		
		// Imprimir as temperaturas na unidade pedida pelo usu�rio com a unidade objetivo
		System.out.println("\nAs temperaturas finais obtidas foram respectivamente: ");
		for(int i = 0;i<qtdTemperaturas;i++) {
			System.out.printf("%.2f%s\n", TemperaturasFinais[i], UnidadeFinal);
		}
		
		// Imprimir a m�dia das temperaturas da unidade objetivo
		double mediaFinal = getMedia(TemperaturasFinais);
		System.out.printf("\nA m�dia das temperaturas finais obtidas � %.2f%s\n", mediaFinal, UnidadeFinal);
	
	}
}
