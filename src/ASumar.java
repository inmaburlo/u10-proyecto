
public class ASumar {

	/**
	 * Dado un numero en formato String, recorre cada cifra (cada posicion del string) y convierte 
	 * esa cifra en entero para ir acumulándolo en la variable suma, que al final acumulará la suma
	 * de todos los dígitos
	 * @param numero
	 * @return
	 */
	public int sumar(String numero) {
		int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            String digito = numero.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);
        }
        return suma;
	}

}
