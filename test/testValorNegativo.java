import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testValorNegativo {

	@Test
    public void valorNegativo() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("-5");
        assertEquals("-5=null",resultado);
    }

}
