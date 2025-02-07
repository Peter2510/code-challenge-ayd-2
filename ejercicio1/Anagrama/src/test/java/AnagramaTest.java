import com.ayd2.anagrama.Anagrama;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author peterg
 */
@ExtendWith(MockitoExtension.class)
public class AnagramaTest {
    
    Anagrama anagrama;
    
    @BeforeEach
    public void setup(){
      anagrama = new Anagrama();
    }

    @Test
    public void esAnagrama() {
        assertTrue(anagrama.validarAnagrama("espada", "pesada"));
    }

    @Test
    public void noAnagrama() {
        assertFalse(anagrama.validarAnagrama("espada", "pesads"));
    }

    @Test
    public void falloLongitudPalabras() {
        assertFalse(anagrama.validarAnagrama("hola", "co"));

    }

}
