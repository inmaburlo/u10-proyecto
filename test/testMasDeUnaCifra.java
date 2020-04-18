import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMasDeUnaCifra {

	@Test
    public void testMasDeUnaCifra() {
        ASumar sumi = new ASumar();
        int resultado = sumi.sumar("13");
        assertEquals(4,resultado);
    }

}
