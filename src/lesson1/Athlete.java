package lesson1;

public interface Athlete {
  int DEFAULT_HEIGHT = 1;
  int DEFAULT_DISTANCE = 1000;
  int getJumpHeight();
  int getRunDistance();
  void jump();
  void run();
}
