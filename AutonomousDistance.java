// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Drivetrain2;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {

  private Drivetrain2 m_drivetrain;
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param m_drivetrain2 The drivetrain subsystem on which this command will run
   */
  
  public AutonomousDistance(Drivetrain2 m_drivetrain2) {

    m_drivetrain = m_drivetrain2;

    addCommands(
        new DriveDistance(-0.5, 0, 60, m_drivetrain),
        new DriveDistance(-0.5, 0.3, 78, m_drivetrain),
        new DriveDistance(-0.5, -0.3, 78, m_drivetrain),
        new TurnDegrees(-0.5, 90, m_drivetrain),
        new DriveDistance(-0.5, 0.3, 78, m_drivetrain),
        new DriveDistance(-0.5, -0.3, 78, m_drivetrain),
        new TurnDegrees(-0.5, -90, m_drivetrain));
  }
  
}

//Semi Circle
//new DriveDistance(-0.5, 0.3, 39, m_drivetrain)
