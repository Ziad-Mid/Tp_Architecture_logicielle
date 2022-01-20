package chain.services;

import observer.Budget;
import observer.Demande;

public interface Handler {
    void setNextHandler(Handler handler);

    void handle(Demande demande, Budget budget);
}
