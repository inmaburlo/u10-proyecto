
public class ASumar {

	/**
	 * Dado un número en formato String, devuelve una sentencia del tipo numero = numero,
	 * si el número es de un solo digito o numero = null si el número en formato String es 
	 * negativo cifra+cifra+..=resultado si el número en formato String tiene más de una cifra
	 * @param cad
	 * @return
	 */
	public String mostrar(String cad) {
		int suma = 0;
		String numero = cad;
		String resultado = "";
        if (numero.length() == 1 && Integer.parseInt(cad) > 0) {
            return (numero + " = " + numero);
        } else {
        	int valor = Integer.parseInt(numero);
    		if(valor < 0) {
    			return numero + "=null";
    		}else {
    	        for (int i = 0; i < numero.length(); i++) {
    	            String digito = numero.substring(i, i+1);
    	            resultado += digito + "+";
    	            suma = suma + Integer.parseInt(digito);
    	        }
    	        //quitamos el + de sobra de la cadena resultado
    	        resultado = resultado.substring(0,resultado.length()-1);
    	        return resultado + "=" + suma;
    		}
        }
	}
}
