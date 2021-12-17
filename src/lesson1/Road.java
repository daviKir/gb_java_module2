package lesson1;

public class Road {
  private final int distance;

  public Road(int height) {
    this.distance = height;
  }

  public int getDistance() {
    return distance;
  }

  public boolean checkRun(Object o) throws Exception {
    if (o instanceof Runnable obj) {
      obj.run();
      if (obj.getRunDistance() >= distance) {
        System.out.printf("Could run distance of %d\n", distance);
        return true;
      }
      System.out.printf("Could not run distance of %d\n", distance);
      return false;
    } else {
      throw new Exception("invalid object type");
    }
  }
}
