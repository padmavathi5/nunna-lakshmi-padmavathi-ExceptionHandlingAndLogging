package com.epam.logging.ExceptionHandlingLogging;

class Simple{
	int p;
	int t;
	int r;
	Simple(int p,int t,int r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public double simpleInt() {
		return ((p*t*r)/100);
	}
}