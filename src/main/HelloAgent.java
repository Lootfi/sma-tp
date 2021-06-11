package main;

import jade.core.Agent;
import jade.util.leap.Iterator;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SimpleBehaviour;

public class HelloAgent extends Agent {


	protected void setup() {
//		System.out.println("Hello World from "+ getLocalName());
//		System.out.println("My Name is: "+ getAID().getLocalName());
//		System.out.println("My Local Name is: "+ getAID().getLocalName());
//		System.out.println("My Name is: "+ getAID().getName());
		getAID().setLocalName("NewLocalName");
//
//		System.out.println("My new Local Name is: "+ getAID().getLocalName());
		
//		Iterator it = getAID().getAllAddresses();
//		System.out.println("My addresses: ");
//		while(it.hasNext()) {
//			System.out.println("=> " + it.next());
//			System.out.println("My arguments are:");
//			Object[] args = getArguments();
//			if (args != null) {
//				for (int i = 0; i < args.length; ++i) {
//					System.out.println("=> "+args[i]);
//					}
//				}
//			else {
//				System.out.println("No Arguments");
//			}
//		}
		addBehaviour(new SimpleBehaviour() {
			
			@Override
			public boolean done() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public void action() {
				System.out.println("Hello I'm agent X");
				
			}
		});
		
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				System.out.println("Hello I'm agent X");
				
			}
		});
//		doDelete();
	}
	
//	protected void takeDown() {
//		System.out.println("Bye ..");
//	}
	
}
