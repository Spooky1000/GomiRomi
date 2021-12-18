// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Drivetrain2;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
public class AutonomousTime extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on time. This will drive out for a period of time, turn
   * around for time (equivalent to time to turn around) and drive forward again. This should mimic
   * driving out, turning around and driving back.
   *
   * @param m_drivetrain The drive subsystem on which this command will run
   */
  // public AutonomousTime(Drivetrain2 m_drivetrain) {
  //   addCommands(
  //       new DriveTime(-0.6, 2.0, m_drivetrain),
  //       new TurnTime(-0.5, 1.3, m_drivetrain),
  //       new DriveTime(-0.6, 2.0, m_drivetrain),
  //       new TurnTime(0.5, 1.3, m_drivetrain));
  // }
}