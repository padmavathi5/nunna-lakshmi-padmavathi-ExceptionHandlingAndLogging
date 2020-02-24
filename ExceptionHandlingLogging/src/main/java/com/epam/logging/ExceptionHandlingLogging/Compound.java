package com.epam.logging.ExceptionHandlingLogging;

class Compound{
	int p;
	int t;
	int r;
	Compound(int p,int t,int r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public double compoundInt() {
		double temp=(1+r/100);
		return (p*(Math.pow(temp,t)));
	}
}