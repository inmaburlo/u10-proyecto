import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testValorNegativo {

	@Test
    public void valorNegativo() {
        ASumar sumi = new ASumar();
        Integer resultado = sumi.sumar("-5");
        assertEquals(null,resultado );
    }

}
