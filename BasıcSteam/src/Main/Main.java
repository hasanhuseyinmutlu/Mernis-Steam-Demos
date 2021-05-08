package Main;

import java.time.LocalDate;

import Concretes.CampaigningManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaigning;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamerManager gamerManager = new GamerManager();
		GameManager gameManager = new GameManager();
		CampaigningManager campaigningManager = new CampaigningManager();
		SaleManager saleManager = new SaleManager();
		Game game1 = new Game(1, "Resıdant Evıl VILLAGE", 240);	
		Game game2 = new Game(2, "Among Us",10);
		Gamer gamer1 = new Gamer(1, "Yasın", "Mutlu", "18325888587", LocalDate.of(2002, 01, 14));
		Gamer gamer2 = new Gamer(2, "Hasan", "Mutlu", "243687789", LocalDate.of(2005, 05, 06));
		Campaigning campaigning1 = new Campaigning(1, "Yaz indirimleri" , 25);
		Campaigning campaigning2 = new Campaigning(2, "Kış İndirimleri", 30);
		
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game2);
		campaigningManager.add(campaigning2);
		saleManager.sell(game1, gamer1, campaigning2);
	}

}
