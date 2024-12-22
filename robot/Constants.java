package frc.robot;

public final class Constants {
  public static class Subsystems{
    public static class Shootersubsystem{
      public static class MotorIDS { 
       public static final int LEFT_TALON_ID = 1;
      public static final int RIGHT_TALON_ID = 2;
      }
      public static class PIDValues{
        public static final double KP = 1;
        public static final double KI = 1;
        public static final double KD = 1;
      }
    }
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
