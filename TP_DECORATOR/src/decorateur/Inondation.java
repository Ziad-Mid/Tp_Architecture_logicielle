package decorateur;

import assuranceConcrete.Assurance;

public class Inondation extends DecorateurAbstract{

    public Inondation(Assurance assurance){
        this.assurance =assurance;
    }

    @Override
    public double getPrice() {
        return this.assurance.getPrice() + 150;
    }

    @Override
    public String getDescription() {
        return this.assurance.getDescription() + " + Inondation";
    }
}
