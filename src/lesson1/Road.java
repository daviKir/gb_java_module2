package lesson1;

public class Road implements Obstacle {
  private final int distance;

  public Road(int height) {
    this.distance = height;
  }

  public boolean checkObstaclePass(Athlete obj) {
    obj.run();
    if (obj.getRunDistance() >= distance) {
      System.out.printf("Could run distance of %d\n", distance);
      return true;
    }
    System.out.printf("Could not run distance of %d\n", distance);
    return false;
  }
}
