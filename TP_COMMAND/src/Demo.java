import command.*;

public class Demo {

    public static void main(String[] args) {
        Remote remote = new Remote();

        Light light = new Light();
        Tv tv = new Tv();

        remote.setSlot(new LightOn(light));
        remote.PressButton();
        remote.setSlot(new LightOff(light));
        remote.PressButton();
        remote.setSlot(new TvOn(tv));
        remote.PressButton();
        remote.setSlot(new TvOff(tv));
        remote.PressButton();

    }




}
