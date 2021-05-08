package Concretes;

import Abstracts.SaleService;
import Entities.Campaigning;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sell(Game game, Gamer gamer, Campaigning campaigning) {
		double totalPrice = game.getPrice() -(game.getPrice()* campaigning.getDiscount()/100);
		System.out.println(gamer.getFirtsName() + " isimli oyuncuya " + game.getName() + " oyunu " + totalPrice + " TL ye satýldý.");
		
	}


}
