import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ValorIngressoRegular {
    Regular regular;

    @BeforeEach 
    public void estrutura (){
        
    //arrange
    regular = new Regular ("A noiva Cadáver", null);

    }

    @Test
    public void calcularValorIngressoRegularAdicionais(){
        regular.incluir(EAdicional.PIPOCA);
        regular.incluir(EAdicional.REFRIGERANTE);
        regular.incluir(EAdicional.BALDE_ESPECIAL);

        double valorIngresso = regular.valorIngresso();

        assertEquals(71d, valorIngresso,0.01d);
    }
    


}
