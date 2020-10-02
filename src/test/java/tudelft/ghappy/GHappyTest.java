package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GHappyTest {

    private GHappy gh;
    @BeforeEach
    public void initialize() {this.gh = new GHappy();}

    @Test
    public void OneHappyg() {
        boolean result = gh.gHappy("ddggvvvaa");
        Assertions.assertTrue(result);
    }
    @Test
    public void ManyHappyg() {
        boolean result = gh.gHappy("vvvggaaggg");
        Assertions.assertTrue(result);
    }

    @Test
    public void NotHappyg(){
        boolean result = gh.gHappy("hijigui");
        Assertions.assertFalse(result);
    }

    @Test
    public void FirstUnhappyg(){
        boolean result = gh.gHappy("ghijiui");
        Assertions.assertFalse(result);

    }
    @Test
    public void LastUnhappyg() {
        boolean result = gh.gHappy("hijiuig");
        Assertions.assertFalse(result);
    }
}
