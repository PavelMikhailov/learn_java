package Pavel.learn_java.homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Pavel on 02.03.2016.
 */
public class PointTests {

  @Test
  public void testDistance(){
    Point p1 = new Point(2, 4);
    Point p2 = new Point(2, 8);
    //assert p1.distance(p2) == 4.0;
    Assert.assertEquals(p1.distance(p2), 4.0);
  }

}
