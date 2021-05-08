package Entities;

public class Sale {
	private int Id;
	private int gameId;
	private int gamerId;
	private double afterDiscountPrice;
	
	public Sale() {
		
	}

	public Sale(int id, int gameId, int gamerId, double afterDiscountPrice) {
		super();
		Id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
		this.afterDiscountPrice = afterDiscountPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public double getAfterDiscountPrice() {
		return afterDiscountPrice;
	}

	public void setAfterDiscountPrice(double afterDiscountPrice) {
		this.afterDiscountPrice = afterDiscountPrice;
	}
	
	
}
