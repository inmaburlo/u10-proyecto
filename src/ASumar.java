
public class ASumar {

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
