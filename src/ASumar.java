
public class ASumar {

	/**
	 * Dado un numero en formato String, recorre cada cifra (cada posicion del string) y convierte 
	 * esa cifra en entero para ir acumul�ndolo en la variable suma, que al final acumular� la suma
	 * de todos los d�gitos
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
