package decorateur;

import assuranceConcrete.Assurance;

public abstract class DecorateurAbstract extends Assurance{

    Assurance assurance;

    public abstract String getDescription() ;

}
