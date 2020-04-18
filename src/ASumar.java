
public class ASumar {

	/**
	 * Dado un número en formato String, devuelve una sentencia del tipo numero = numero,
	 * si el número es de un solo digito o cadena vacia, si no lo es
	 * @param cad
	 * @return
	 */
	public String mostrar(String cad) {
		String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else {
        	return "";
        }
	}

	
	/**
	 * Dado un número, comprueba si es negativo. En ese caso, devuelve null (el valor esperado en el test)
	 * en otro caso, recorre cada cifra (cada posicion del string) y convierte 
	 * esa cifra en entero para ir acumulándolo en la variable suma, que al final acumulará la suma
	 * de todos los dígitos. 
	 * NOTA: al método se le ha puesto que devuelva un tipo Integer porque
	 * permite devolver el valor null, el tipo primitivo int no lo permitía.
	 * @param numero
	 * @return
	 */
	public Integer sumar(String numero) {
		int suma = 0;
		int valor = Integer.parseInt(numero);
		if(valor < 0) {
			return null;
		}else {
	        for (int i = 0; i < numero.length(); i++) {
	            String digito = numero.substring(i, i+1);
	            suma = suma + Integer.parseInt(digito);
	        }
	        return suma;
		}
	}

}
