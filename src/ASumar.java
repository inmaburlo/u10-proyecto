
public class ASumar {

	/**
	 * Dado un n�mero en formato String, devuelve una sentencia del tipo numero = numero,
	 * si el n�mero es de un solo digito o cadena vacia, si no lo es
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
	 * Dado un n�mero, comprueba si es negativo. En ese caso, devuelve null (el valor esperado en el test)
	 * en otro caso, devuelve el numero. NOTA: al m�todo se le ha puesto que devuelva un tipo Integer porque
	 * permite devolver el valor null, el tipo primitivo int no lo permit�a.
	 * @param numero
	 * @return
	 */
	public Integer sumar(String numero) {
		int valor = Integer.parseInt(numero);
		if(valor < 0) {
			return null;
		}else {
			return valor;
		}
	}

}
