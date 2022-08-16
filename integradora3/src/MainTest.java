import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    RoupasFlyweight roupasFlyweight;

    @BeforeEach
    public void doBefore() {
        roupasFlyweight = new RoupasFlyweight();
    }

    @Test
    public void testeQuantidadeERetorno() {
        assertEquals("Roupas{tamanho='P', tipo='Camisas', Novo=true, importada=true}", roupasFlyweight.adicionar("P","Camisas", true,true).toString());
        assertEquals("Roupas{tamanho='M', tipo='Bermudas', Novo=true, importada=true}", roupasFlyweight.adicionar("M","Bermudas", true,true).toString());
        assertEquals("Roupas{tamanho='G', tipo='Calca', Novo=true, importada=true}", roupasFlyweight.adicionar("G","Calca", true,true).toString());
        assertEquals(3, roupasFlyweight.getRequest());
    }
}