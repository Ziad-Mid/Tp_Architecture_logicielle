package decorateur;

import assuranceConcrete.Assurance;

public class DommageDeCollision extends DecorateurAbstract{

    public DommageDeCollision(Assurance assurance){
        this.assurance =assurance;
    }

    @Override
    public double getPrice() {
        return this.assurance.getPrice() + 300;
    }

    @Override
    public String getDescription() {
        return this.assurance.getDescription() + " + DommageDeCollision";
    }
}
