package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+"oyun eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+"oyun silindi !");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" güncellendi");
		
	}



}
