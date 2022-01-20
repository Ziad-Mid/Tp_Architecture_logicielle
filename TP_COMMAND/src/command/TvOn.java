package command;

public class TvOn implements Command{

    Tv tv ;

    public TvOn(Tv tv){
        this.tv = tv ;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
