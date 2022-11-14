package job_2;

public class Circle {
  private Point center;
  private int radius;
  
  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }
  
  public Point getCenter() {
    return center;
  }
  
  public int getRadius() {
    return radius;
  }
  
  public void setCenter(Point center) {
    this.center = center;
  }
  
  public void setRadius(int radius) {
    this.radius = radius;
  }
}

class Point {
  public int x;
  public int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Tester {

}