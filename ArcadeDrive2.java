package frc.robot.commands;

import java.util.function.Supplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain2;

public class ArcadeDrive2 extends CommandBase{

    private final Drivetrain2 m_drivetrain;
    private final Supplier <Double> m_xaxisSpeedSupplier;
    private final Supplier <Double> m_zaxisRotationSupplier;

    public ArcadeDrive2
    (
        Drivetrain2 m_drivetrain,
        Supplier<Double> m_xaxisSpeedSupplier,
        Supplier<Double> m_zaxisRotationSupplier
    ){

        this.m_drivetrain = m_drivetrain;
        this.m_xaxisSpeedSupplier = m_xaxisSpeedSupplier;
        this.m_zaxisRotationSupplier = m_zaxisRotationSupplier;
        addRequirements(m_drivetrain);
    }
    
    @Override
    public void initialize() {}

    @Override
    public void execute(){
        m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotationSupplier.get());
    }
    
    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
