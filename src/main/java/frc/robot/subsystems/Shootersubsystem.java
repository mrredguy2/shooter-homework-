package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import frc.robot.Constants;

public class Shootersubsystem {
    private final TalonFX rightTalonFX = new TalonFX(Constants.Subsystemsconstants.Shootersubsystemconstants.LEFT_TALON_SUBSYSTEMSHOOTER_ID);
    private final TalonFX leftTalonFX = new TalonFX(Constants.Subsystemsconstants.Shootersubsystemconstants.RIGHT_TALON_SUBSYSTEMSHOTTER_ID);    
    private final PIDController PID = new PIDController(Constants.Subsystemsconstants.Shootersubsystemconstants.ShootersubsystemPIDconstants.KP, Constants.Subsystemsconstants.Shootersubsystemconstants.ShootersubsystemPIDconstants.KI, Constants.Subsystemsconstants.Shootersubsystemconstants.ShootersubsystemPIDconstants.KD);
    public Shootersubsystem(){
        this.rightTalonFX.setInverted(false);
        this.leftTalonFX.setInverted(true);
        this.PID.setSetpoint(2000);
    }
    public double GetSpeedInRPM(){
        return this.rightTalonFX.getVelocity().getValueAsDouble() * 60;
    }
    public double CalculatePID(){
        return PID.calculate(GetSpeedInRPM());
    }
    public void MoveMotor(double speed){
        this.rightTalonFX.set(speed);
        this.leftTalonFX.set(speed);
    }
}
