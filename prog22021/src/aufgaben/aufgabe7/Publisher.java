package aufgaben.aufgabe7;



public interface Publisher {

	public abstract boolean register(Listener listener);
	public abstract boolean unregister(Listener listener);
	public abstract void notifyListeners();
	public abstract String getUpdate(Listener listener);
}
