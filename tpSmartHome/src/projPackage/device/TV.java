package projPackage.device;

public class TV implements Device {


    @Override
    public String on() {
        return "TV On";
    }

    @Override
    public String off() {
        return "TV Off";
    }
}
