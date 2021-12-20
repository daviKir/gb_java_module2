package lesson1;

public class Cat implements Athlete {
  private final String name;
  private final int runDistance;
  private final int jumpHeight;

  public Cat(String name, int runDistance, int jumpHeight) {
    this.name = name;
    this.jumpHeight = jumpHeight;
    this.runDistance = runDistance;
  }

  public Cat(String name) {
    this(name, DEFAULT_DISTANCE, DEFAULT_HEIGHT);
  }

  @Override
  public int getRunDistance() {
    return runDistance;
  }

  @Override
  public int getJumpHeight() {
    return jumpHeight;
  }

  @Override
  public void jump() {
    System.out.printf("Cat %s is running\n", name);
  }

  @Override
  public void run() {
    System.out.printf("Cat %s is jumping\n", name);
  }
}
