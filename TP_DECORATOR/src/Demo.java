import assuranceConcrete.Assurance;
import assuranceConcrete.RespoCivile;
import decorateur.Incendie;
import decorateur.Vol;

public class Demo {

    public static void main(String[] args) {
        Assurance assurance =new RespoCivile();
        System.out.println("Assurance : " + assurance.getDescription() + " ||| COST : " + assurance.getPrice() );

        assurance = new Incendie(assurance);
        assurance = new Vol(assurance);

        System.out.println("Assurance : " + assurance.getDescription() + " ||| COST : " + assurance.getPrice() );

    }




}
