package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shootersubsystem;

public class shooterComands extends Command{
    private final Shootersubsystem Shootersubsystem;
    public shooterComands(Shootersubsystem shootersubsystemconstructor){
        Shootersubsystem = shootersubsystemconstructor;

        addRequirements(shootersubsystemconstructor);
    }
    private void addRequirements(Shootersubsystem shootersubsystemconstructor) {
        throw new UnsupportedOperationException("Unimplemented method 'addRequirements'");
    }
    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Shootersubsystem.MoveMotor(Shootersubsystem.CalculatePID());
    }
    @Override
    public void end(boolean interrupted) {}
    @Override
    public boolean isFinished() {
        return false;
    }
}
