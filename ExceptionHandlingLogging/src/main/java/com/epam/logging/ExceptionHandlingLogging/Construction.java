package com.epam.logging.ExceptionHandlingLogging;
class Construction{
	int cost;
	int area;
	Construction(int cost,int area){
		this.cost=cost;
		this.area=area;
	}
	public int totalAmount() {
		return (cost*area);
	}
}