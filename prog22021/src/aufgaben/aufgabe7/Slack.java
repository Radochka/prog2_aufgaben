package aufgaben.aufgabe7;

import java.util.*;

public class Slack implements Publisher{

	private Set<Listener> listeners;
	private int nrOfMessages;
	
	Slack(){
		this.listeners = new TreeSet<>();
		this.nrOfMessages = 0;
		
	}
	@Override
	public boolean register(Listener listener) {
		if(this.listeners.add(listener)) return true;
		else return false;
	}

	@Override
	public boolean unregister(Listener listener) {
		if(this.listeners.remove(listener)) return true;
		else return false;
	}

	@Override
	public void notifyListeners() {
		for (Listener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public String getUpdate(Listener listener) {
		return "Breaking New" + this.nrOfMessages;
	}
	
	public void publishNew() {
		this.notifyListeners();
		nrOfMessages++;
	}

}
