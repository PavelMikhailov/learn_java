package Pavel.learn_java.homework1;

/**
 * Created by Pavel on 01.03.2016.
 */
public class Point {

  double x;
  double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;

  }
  public double distance() {
    return Math.sqrt(Math.pow(this.x - this.x, 2) + Math.pow(this.y - this.y, 2));
  }

}
