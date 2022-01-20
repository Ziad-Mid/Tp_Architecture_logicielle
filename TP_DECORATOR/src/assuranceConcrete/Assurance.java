package assuranceConcrete;

public abstract class Assurance {

    String description = "" ;

    public String getDescription(){
        return description;
    }

    public abstract double getPrice() ;


}
