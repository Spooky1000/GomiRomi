package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain2;

public class CloverDrive extends SequentialCommandGroup {

    private Drivetrain2 m_drivetrain;
 
    public CloverDrive(Drivetrain2 m_drivetrain2)
    {
        m_drivetrain = m_drivetrain2;

        addCommands
        (
            new DriveDistance(-0.5, 0, 60, m_drivetrain),
            new DriveDistance(-0.5, 0.3, 78, m_drivetrain),
            new DriveDistance(-0.5, -0.3, 78, m_drivetrain),
            new TurnDegrees(-0.5, 90, m_drivetrain),
            new DriveDistance(-0.5, 0.3, 78, m_drivetrain),
            new DriveDistance(-0.5, -0.3, 78, m_drivetrain),
            new TurnDegrees(-0.5, -90, m_drivetrain)
        );
    }

}
