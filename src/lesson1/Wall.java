package lesson1;

public class Wall implements Obstacle {
  private final int height;

  public Wall(int height) {
    this.height = height;
  }

  public boolean checkObstaclePass(Athlete obj) {
    obj.jump();
    if (obj.getJumpHeight() >= height) {
      System.out.printf("Could jump height of %d\n", height);
      return true;
    }
    System.out.printf("Could not jump height of %d\n", height);
    return false;
  }
}
