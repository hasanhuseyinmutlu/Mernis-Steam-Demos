package Abstracts;

import Entities.Campaigning;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void sell(Game game,Gamer gamer,Campaigning campaigning);
}
