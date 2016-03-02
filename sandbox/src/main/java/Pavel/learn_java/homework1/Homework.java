package Pavel.learn_java.homework1;

/**
 * Created by Pavel on 01.03.2016.
 */
public class Homework {

  public static void main(String[] agrs) {


    Point p1 = new Point(2, 4);
    System.out.println("p1 = " + p1.x + ", " + p1.y);

    Point p2 = new Point(2, 8);
    System.out.println("p2 = " + p2.x + ", " + p2.y);
    System.out.println("Длинна прямой между точками р1 (" + p1.x + ", " + p1.y + ") и р2 (" + p2.x + ", " + p2.y +") = " + distance(p1, p2));
    double d = p1.distance(p2);
    System.out.println("Длинна прямой между точками р1 (" + p1.x + ", " + p1.y + ") и р2 (" + p2.x + ", " + p2.y +") = " + p1.distance(p2));
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow (p1.y - p2.y, 2));
  }

}
