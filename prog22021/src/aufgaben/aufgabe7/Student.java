package aufgaben.aufgabe7;

public class Student implements Listener{

	private String name;
	private Publisher publisher;
	
	Student(String name){
		this.name = name;
	}
	@Override
	public void update() {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void setPublisher(Publisher publisher) {
		if(publisher.register(null))
		
		System.out.println(this.name + "registered!");
	}

	@Override
	public void removePublisher(Publisher publisher) {
		// TODO Automatisch generierter Methodenstub
		
	}

}
