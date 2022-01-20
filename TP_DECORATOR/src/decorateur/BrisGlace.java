package decorateur;

import assuranceConcrete.Assurance;

public class BrisGlace extends DecorateurAbstract{

    public BrisGlace(Assurance assurance){
        this.assurance = assurance;
    }

    @Override
    public double getPrice() {
        return this.assurance.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.assurance.getDescription() + " + BrisGlace";
    }
}
