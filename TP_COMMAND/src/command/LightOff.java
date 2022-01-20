package command;

public class LightOff implements Command{
    Light light;

    public LightOff(Light light) {
        this.light = light ;
    }

    @Override
    public void execute() {
        light.off();
    }
}
