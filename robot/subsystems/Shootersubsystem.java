package frc.robot.subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;


import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.Subsystems.Shootersubsystem.MotorIDS;
import frc.robot.Constants.Subsystems.Shootersubsystem.PIDValues;

public class Shootersubsystem {
    
    private final TalonFX rightTalonFX = new TalonFX(MotorIDS.RIGHT_TALON_ID);
    private final TalonFX leftTalonFX = new TalonFX(MotorIDS.LEFT_TALON_ID);    
    private final PIDController PID = new PIDController(PIDValues.KP, PIDValues.KI, PIDValues.KD);
    private VelocityVoltage velocityVoltage = new VelocityVoltage(0).withSlot(0);
        public final void addFollower(Follower follower){
             final Follower followerObj = new Follower(MotorIDS.RIGHT_TALON_ID , true);
                 leftTalonFX.setControl(followerObj);
    }
    private void configureMotor (TalonFX motor){
        Slot0Configs slot0Configs = new Slot0Configs();
        slot0Configs.kP = PIDValues.KP;
        slot0Configs.kI = PIDValues.KI;
        slot0Configs.kD = PIDValues.KD;
        motor.getConfigurator().apply(slot0Configs);
    }
    

    final VelocityVoltage m_request = new VelocityVoltage(0).withSlot(0);
    {
    rightTalonFX.setControl(m_request.withVelocity(8).withFeedForward(0.5));
    }
    public void SetSetPoint(double setPoint){
        velocityVoltage = new VelocityVoltage(setPoint); 
    }
    public void SetMotorTarget(){
        rightTalonFX.setControl(velocityVoltage);
    }
    public double GetSpeedInRPS(){
        return this.rightTalonFX.getVelocity().getValueAsDouble();
    }
    public double CalculatePID(){
        return PID.calculate(GetSpeedInRPS());
    }
    public void MoveMotor(double speed){
        this.rightTalonFX.set(500);
    }
    public void stopMotors(double speed){
        this.rightTalonFX.set(0);
    }
}


