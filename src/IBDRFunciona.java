import java.util.Scanner;

public class IBDRFunciona {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String numero;
		ASumar sumi = new ASumar();
		
		System.out.println("Introduce un n�mero: ");
		numero = entrada.nextLine();
		/**
		 * Si es un n�mero de una sola cifra (no negativo), llamamos al m�todo mostrar, que muestra
		 * por pantalla numero = numero, si no, llamamos al m�todo suma que mostrar�, si es un n�mero 
		 * negativo, null, y si no, la suma de los digitos que componen el n�mero.
		 */
		if(Integer.parseInt(numero) < 10 && Integer.parseInt(numero) > 0) {
			System.out.println("Resultado: " + sumi.mostrar(numero));
		}else {
			System.out.println("Resultado: " + sumi.sumar(numero));
		}
	}

}
