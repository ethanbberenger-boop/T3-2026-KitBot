// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.outputMove;
import frc.robot.commands.inputMove;
import frc.robot.commands.*;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Input;
import frc.robot.subsystems.Output;
import frc.robot.subsystems.TankDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */


public class RobotContainer {
  //controller
  private final Input input;
  private final inputMove inputmove;
  private final Output output;
  private final outputMove outputmove;
  private final CommandXboxController operator = new CommandXboxController(OperatorConstants.kDriverControllerPort);
//commands
  private final TankDrive drive = new TankDrive(() -> operator.getLeftY(),() -> operator.getRightX());
  //subsystem
  
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    input = new Input();
    inputmove = new inputMove(input);
    output = new Output();
    outputmove = new outputMove(output);
    configureBindings();
      }
    
    
      private void configureBindings() {
        operator.leftTrigger(.1).whileTrue(inputmove);
        operator.rightTrigger(.1).whileTrue(outputmove);
      }
}