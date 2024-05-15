package ejemplo1_Threads;

public class proceso extends Thread{

	//String nameProcess;
	
	public proceso(String nameProcess) {
		super(nameProcess);
		//this.nameProcess = nameProcess;
	}

	public void listValues() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+": proceso"+i);
		}
	}
	
	public void run() {
		listValues();

		
	}
}
