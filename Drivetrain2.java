package frc.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.sensors.RomiGyro;


public class Drivetrain2 extends SubsystemBase{

    private static final double kCountsPerRevolution = 1440.0;
    private static final double kWheelDiameterInch = 2.75591;
    
    private Spark motor_left;
    private Spark motor_right;

    private Encoder encoder_left;
    private Encoder encoder_right;

    private DifferentialDrive differentialDrive;

    private final RomiGyro m_gyro = new RomiGyro();
    private final BuiltInAccelerometer m_accelerometer = new BuiltInAccelerometer();

    public Drivetrain2()
    {
        configMotor();
        configEncoders();

        encoder_left.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
        encoder_right.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);

        differentialDrive = new DifferentialDrive(motor_left, motor_right);
        resetEncoders();
    }

    public void arcadeDrive(double xaxisSpeed, double zRotation)
    {
        differentialDrive.arcadeDrive(xaxisSpeed, zRotation);
    }

    private static final double MESSAGE_INTERVAL = 1.0;
    private double m_nextMessageTime;

    public void configMotor()
    {
        motor_left = new Spark(0);
        motor_right = new Spark(1);
    }

    public void configEncoders()
    {
        encoder_left = new Encoder(4, 5);
        encoder_right = new Encoder(6, 7);
    }

    public void resetEncoders()
    {
        encoder_left.reset();
        encoder_right.reset();

    }

    public double getLeftEncoderCount()
    {
        return encoder_left.get();
    }

    public double getRightEncoderCounter()
    {
        return encoder_right.get();
    }

    public double getLeftDistanceInch()
    {
        return encoder_left.getDistance();
    }

    public double getRightDistanceInch()
    {
        return encoder_right.getDistance();
    }

    public double getAverageDistanceInch() {
		return (getRightDistanceInch() + getLeftDistanceInch())/2;
    }
    
    public double getAccelX() {
        return m_accelerometer.getX();
      }

      public double getAccelY() {
        return m_accelerometer.getY();
      }
    
      public double getAccelZ() {
        return m_accelerometer.getZ();
      }
    
      public double getGyroAngleX() {
        return m_gyro.getAngleX();
      }

      public double getGyroAngleY() {
        return m_gyro.getAngleY();
      }

      public double getGyroAngleZ() {
        return m_gyro.getAngleZ();
      }

    public void periodic()
    {
        //nothing
    }	
}
