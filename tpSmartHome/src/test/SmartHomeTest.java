package test;

import org.junit.Assert;
import org.junit.Test;
import projPackage.*;
import projPackage.device.Camera;
import projPackage.device.Device;
import projPackage.device.TV;

public class SmartHomeTest {

    /*
    programmer une maison domotique java.SmartHome avec une télécommande qui peut être
    utilisée pour contrôler différentes appareils java.TV, java.Camera.
    La télécommande comprend des emplacements programmables.
    Chaque emplacement peut être attribué à un appareil domestique différent : java.TV, java.Camera
    Chaque emplacement a un bouton on/off correspondant.
    La télécommande a un bouton d'annulation global qui annule le dernier bouton pressé.
     */
    @Test
    public void report() {
        int nbrSlot=2;
        Adresse adresse = new Adresse(123,"agadir");
        Device tv =new TV();
        Device camera = new Camera();
        RemoteControl remoteControl = new RemoteControl(nbrSlot);
        remoteControl.init(tv,camera);
        SmartHome smartHome = new ConcretSmartHomeBuilder("ny Homa",12345)
                .withAdresse(adresse)
                .withRemoteControl(remoteControl)
                .build();
        smartHome.getRemoteControl().onButtonPressed(0);
        smartHome.getRemoteControl().offButtonPressed(0);
        smartHome.getRemoteControl().onButtonPressed(1);
        smartHome.getRemoteControl().offButtonPressed(1);
        String expectedReport = "TV On-TV Off-Camera On-Camera Off-";
        Assert.assertEquals(expectedReport,smartHome.report());

    }
}