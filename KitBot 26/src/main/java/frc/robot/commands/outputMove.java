package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.Shooter;
public class outputMove extends Command{            
    private Shooter output;
    int time = 0;
    public outputMove(Shooter set){
        output = set;
    }
    @Override
    public void execute() {
        time++;
        if(time < 30){
            output.stopOutput();
        }
        else if(time < 40){
            output.moveOutput(Constants.OutputConstants.motorSpeedMoveOutput);
        }
        else{
        time = 0;
        }
        System.out.println("outputting"); 
        output.moveOutput(Constants.OutputConstants.motorSpeedMoveOutput);
    }
    @Override
    public void end(boolean interrupted) {
        output.stopOutput();
      }
    
      // Returns true when the command should end.
      @Override
      public boolean isFinished() {
        return false;
      }
}
