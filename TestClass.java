import org.junit.Before; // этот импорт лишний, вы его не где не используете
import org.junit.Test;

import java.lang.*;    // этот импорт лишний, вы его не где не используете

public class TestClass {

   int calc;

   @Test
   public void test1() {              // название не иформативное
       calc = (new Math().MathSum(4, 48)); //дужки лишнии, надо вот так "new Math().MathSum(4, 48)"
       assert (calc == (4 + 48)):"Ok";     // заместь (4+48) использовать 50
   }

    @Test
    public void test2() {             // название не иформативное
       calc = (new Math().MathSum(10, 3)); //дужки лишнии, надо вот так "new Math().MathSum(10, 3)"
        assert (calc == (10 + 3)): "Ok";  //попробуйте использовать assertTrue из junit  как в примере
           }
}
