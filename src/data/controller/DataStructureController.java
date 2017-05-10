package data.controller;

import data.model.Customer;
import java.util.*;

public class DataStructureController 
{
	private Customer matt;
	private Customer kadin;
	private Customer amar;
	private Customer jack;
	private Customer aaron;
	
	private Queue<Customer> customerQueue;
	private Stack<Customer> customerStack;
	
	public DataStructureController()
	{
		customerQueue = new LinkedList<Customer>();
		customerStack = new Stack<Customer>();
		matt = new Customer("Matt");
		kadin = new Customer("Kadin");
		amar = new Customer("Amar");
		jack = new Customer("Jack");
		aaron = new Customer("Aaron");
	}
	
	public void start()
	{
		doStuffWithQueue();
		doStuffWithStack();
	}
	
	private void doStuffWithQueue()
	{
		
		customerQueue.add(matt);
		customerQueue.add(kadin);
		customerQueue.add(amar);
		customerQueue.add(jack);
		customerQueue.add(aaron);
		
		customerQueue.remove();
		customerQueue.peek();
		
	
	}
	
	private void doStuffWithStack()
	{
		customerStack.empty();
		customerStack.push(matt);
		customerStack.push(kadin);
		customerStack.peek();
		customerStack.push(amar);
		customerStack.push(jack);
		customerStack.push(aaron);
		customerStack.pop();
		customerStack.pop();
		
		
	}

}
