package frc.robot;

public final class Constants {
  public static class Subsystemsconstants{
    public static class Shootersubsystemconstants{
      public static final int LEFT_TALON_SUBSYSTEMSHOOTER_ID = 1;
      public static final int RIGHT_TALON_SUBSYSTEMSHOTTER_ID = 2;
      
      public static class ShootersubsystemPIDconstants{
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
