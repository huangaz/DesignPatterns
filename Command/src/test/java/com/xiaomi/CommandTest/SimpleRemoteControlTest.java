package com.xiaomi.CommandTest;

import com.xiaomi.Command.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand doorDown = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, doorUp, doorDown);

        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.undoButtonWasPressed();

        System.out.println("**************************");

        Command[] partyOn = {lightOn, doorUp};
        Command[] partyOff = {lightOff, doorDown};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remote.setCommand(2, partyOnMacro, partyOffMacro);
        System.out.println(remote);
        System.out.println("----Pushing Macro On----");
        remote.onButtonWasPressed(2);
        System.out.println("----Pushing Macro Off----");
        remote.offButtonWasPressed(2);
        System.out.println("----Pushing Undo----");
        remote.undoButtonWasPressed();
    }
}
