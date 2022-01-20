package command;

public class TvOff implements Command{

    Tv tv ;

    public TvOff(Tv tv){
        this.tv = tv ;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
