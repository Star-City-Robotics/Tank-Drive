package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DriveTrainSubsystem extends SubsystemBase {
    
    private CANSparkMax leftMotor = new CANSparkMax(10, MotorType.kBrushless);

    public DriveTrainSubsystem() {

    }

    public void forwardLeft() {

    }

    public void forwardRight() {

    }

    public void backwardLeft() {

    }

    public void backwardRight() {

    }
}
