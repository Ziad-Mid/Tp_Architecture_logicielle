package decorateur;

import assuranceConcrete.Assurance;

public class Vol extends DecorateurAbstract{

    public Vol(Assurance assurance){
        this.assurance =assurance;
    }

    @Override
    public double getPrice() {
        return this.assurance.getPrice() + 100;
    }

    @Override
    public String getDescription() {
        return this.assurance.getDescription() + " + Vol";
    }
}
