package main;

import jade.core.behaviours.*;

import jade.core.Agent;

public class NewAgent extends Agent{
	
	protected void setup() {
		
		
		System.out.println("Hello! My name is " + getLocalName());
		
		addBehaviour(
				new WakerBehaviour(this,500) {
					
					long t0= System.currentTimeMillis();
					
					@Override
					public void onWake() {
						System.out.println((System.currentTimeMillis() -t0) + ":I've executed the behavior of type WakeBehaviour!");
						
					}
					}
				);
		
		
		
		addBehaviour(
				new OneShotBehaviour(this) {
					
					public void action() {
						System.out.println("I've executed the behavior of type OneShotBehaviour!");
						}
					}
			);
		
		
		addBehaviour(
				new TickerBehaviour(this,700) {
					int exec = 0;
					
					long t1 = System.currentTimeMillis();
					
					@Override
					public void onTick(){
						if(exec == 3){
							stop();
							}
						else {
							System.out.println((System.currentTimeMillis() -t1) + ": I've executed the behavior of type TickerBehaviour!");
							
							exec++;
							
						}
						}
					}
				);
		}
	
	
	protected void takeDown() {
		
		System.out.println("Finalized with success!");
		
	}   
}