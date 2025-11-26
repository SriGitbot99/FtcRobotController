package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {
@Disabled

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double speedBackward = gamepad1.left_stick_x / -2.0;
        telemetry.addData("x", speedBackward);
        telemetry.addData("y", speedForward);
        telemetry.addData("a button", gamepad1.a);
    }
}
