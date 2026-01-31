package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import frc.robot.Constants;

public class Output {
    private  SparkMax outputMotor;
    private SparkMaxConfig motorConfig;
     public Output(){
     outputMotor = new SparkMax(Constants.OutputConstants.outputMotor, MotorType.kBrushed);
        motorConfig = new SparkMaxConfig();
       motorConfig.smartCurrentLimit(50)
       .idleMode(IdleMode.kCoast)
       .inverted(false);
     }
     public void moveOutput(double speed){
        outputMotor.set(speed);
             }
        public void stopOutput(){
                outputMotor.stopMotor();
        }
}
