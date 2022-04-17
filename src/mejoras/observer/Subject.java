package mejoras.observer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Subject implements Externalizable {
	
	   private List<Observer> observers = new ArrayList<Observer>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   }

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	} 	
	}