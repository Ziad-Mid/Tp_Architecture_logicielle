package projPackage;

public class ConcretSmartHomeBuilder {
    private Adresse adresse;
    private int num;
    private String name;
    private RemoteControl remoteControl;

    public ConcretSmartHomeBuilder(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public ConcretSmartHomeBuilder withAdresse(Adresse adresse){
        this.adresse = adresse;
        return this;
    }

    public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl){
        this.remoteControl = remoteControl;
        return this;
    }

    public SmartHome build(){
        SmartHome smartHome = new SmartHome();
        smartHome.setName(name);
        smartHome.setNum(num);
        smartHome.setAdresse(adresse);
        smartHome.setRemoteControl(remoteControl);

        return smartHome;
    }



}
