package Concretes;

import Abstracts.CampaigningService;
import Entities.Campaigning;

public class CampaigningManager implements CampaigningService {

	@Override
	public void add(Campaigning campaigning) {
		System.out.println("kampanya eklendi");
		
	}

	@Override
	public void delete(Campaigning campaigning) {
		System.out.println("kampanya silindi");
		
	}

	@Override
	public void update(Campaigning campaigning) {
		System.out.println("kampanya güncellendi");
		
	}

}
