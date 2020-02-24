package com.epam.logging.ExceptionHandlingLogging;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
    private static final Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        LOGGER.info("--SIMPLE INTEREST--");
        LOGGER.info("Enter principle amount : ");
        int p=sc.nextInt();
        LOGGER.info("Enter rate of interest : ");
        int r=sc.nextInt();
        LOGGER.info("Enter time duration : ");
        int t=sc.nextInt();
        Simple obj1 = new Simple(p,t,r);
        Compound obj2 = new Compound(p,t,r);
        double amountS=obj1.simpleInt();
        LOGGER.info("Amount is : "+amountS);
        double amountC=obj2.compoundInt();
        LOGGER.info("--COMPOUND INTEREST--");
        LOGGER.info("Amount is : "+amountC);
        LOGGER.info("---CONSTRUCTION COST---");
        LOGGER.info("Enter material standard option..");
        LOGGER.info("Construction cost per sq.feet is\n1.1200INR for standard material\n2.1500INR for above standard material.\n3.1800INR for high standard material\n4.2500INR for high standard material and fully automated home.");
        int op=sc.nextInt();
        int cost = 0;
        if(op==1)
        	cost=1200;
        else if(op==2)
        	cost=1500;
        else if(op==3)
        	cost=1800;
        else if(op==4)
        	cost=2500;
        else
        	LOGGER.info("enter valid option");
        
        LOGGER.info("Enter total area of house : ");
        int area=sc.nextInt();
        Construction obj3 = new Construction(cost,area);
        int total=obj3.totalAmount();
        LOGGER.info("Total cost for construction of house is : "+total);
        
        
    }
}
