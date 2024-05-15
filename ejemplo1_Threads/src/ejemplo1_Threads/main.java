package ejemplo1_Threads;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		proceso pc1=new proceso("Proceso 1");
		proceso pc2=new proceso("Proceso 2");
		proceso pc3=new proceso("Proceso 3");
		pc1.listValues();
		pc2.listValues();
		pc3.listValues();
		
		pc1.start();
		pc2.start();
		pc3.start();
	}

}
