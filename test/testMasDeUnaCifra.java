import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMasDeUnaCifra {

	@Test
    public void testMasDeUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("13");
        assertEquals("1+3=4",resultado);
    }

}
