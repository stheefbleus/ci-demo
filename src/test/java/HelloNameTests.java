import be.kuleuven.HelloName;
import org.junit.jupiter.api.Test;

public class HelloNameTests {
    @Test
    public void gegevenHelloNameStef_whenGetNaam_thenStef(){
        HelloName test = new HelloName("Stef");
        String result = test.getNaam();
        assert(result.equals("Stef"));
    }
}
