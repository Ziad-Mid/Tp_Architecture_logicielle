package decorateur;

import assuranceConcrete.Assurance;

public class Incendie extends DecorateurAbstract{

    public Incendie(Assurance assurance){
        this.assurance =assurance;
    }
    @Override
    public double getPrice() {
        return this.assurance.getPrice() + 200;
    }

    @Override
    public String getDescription() {
        return this.assurance.getDescription() + " + Incendie";
    }
}
