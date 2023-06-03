package SEMINAR.OOP.HomeWork2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actors);
    void update();
}
