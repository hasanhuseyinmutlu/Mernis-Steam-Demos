package Concretes;

import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		if(!(gamer.getFirtsName() ==null) &&!(gamer.getLastName() == null) 
				&& gamer.getNationalyNumber().length() == 11) {
			System.out.println(gamer.getFirtsName() +" "+gamer.getLastName()+"oyuncu sisteme eklendi.");
		} else {
			System.out.println("Oyuncu bilgileri eksik,eklenemedi!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName()+" Silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getLastName()+" güncellendi");
		
	}

}
