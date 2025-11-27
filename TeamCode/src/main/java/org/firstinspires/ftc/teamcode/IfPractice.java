package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;
@Disabled
@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
       boolean aButton = gamepad1.a;

       if(aButton) {
       telemetry.addData("A Button", "Pressed");
       }
            telemetry.addData("A Button State", aButton);

       else {
           telemetry.addData("A Button", "NOT Pressed");
       }
       telemetry.addData("A Button", aButton);
    }
}

