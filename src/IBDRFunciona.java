import java.util.Scanner;

public class IBDRFunciona {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String numero;
		ASumar sumi = new ASumar();
		
		System.out.println("Introduce un n�mero: ");
		numero = entrada.nextLine();
		System.out.println("Resultado: " + sumi.mostrar(numero));
	}

}
