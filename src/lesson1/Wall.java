package lesson1;

public class Wall {
  private final int height;

  public Wall(int height) {
    this.height = height;
  }

  public boolean checkJump(Object o) throws Exception {
    if (o instanceof Jumpable obj) {
      obj.jump();
      if (obj.getJumpHeight() >= height) {
        System.out.printf("Could jump height of %d\n", height);
        return true;
      }
      System.out.printf("Could not jump height of %d\n", height);
      return false;
    } else {
      throw new Exception("invalid object type");
    }
  }
}
