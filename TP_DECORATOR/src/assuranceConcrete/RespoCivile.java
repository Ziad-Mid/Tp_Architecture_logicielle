package assuranceConcrete;

public class RespoCivile extends Assurance{

    public RespoCivile(){
        description = "Responsabilite Civile";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
