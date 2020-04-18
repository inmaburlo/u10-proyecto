import java.util.Scanner;

public class IBDRFunciona {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String numero;
		ASumar sumi = new ASumar();
		
		System.out.println("Introduce un número: ");
		numero = entrada.nextLine();
		/**
		 * Si es un número de una sola cifra (no negativo), llamamos al método mostrar, que muestra
		 * por pantalla numero = numero, si no, llamamos al método suma que mostrará, si es un número 
		 * negativo, null, y si no, la suma de los digitos que componen el número.
		 */
		if(Integer.parseInt(numero) < 10 && Integer.parseInt(numero) > 0) {
			System.out.println("Resultado: " + sumi.mostrar(numero));
		}else {
			System.out.println("Resultado: " + sumi.sumar(numero));
		}
	}

}
