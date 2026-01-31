package frc.robot.commands;
import frc.robot.Constants;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;

public class inputMove extends Command{
    private Input input;
    public inputMove(Input fahhh){
        input = fahhh;
    }
    @Override
    public void execute() {
        input.moveInput(Constants.InputConstants.motorSpeedMoveInput);
      }
    @Override
    public void end(boolean interrupted) {
        input.stopInput();
      }
    
      // Returns true when the command should end.
      @Override
      public boolean isFinished() {
        return false;
      }
}
