package threadsconcept;
class Trainees
{
	 public synchronized void message(String companyname)
	 {
		 for(int i=1;i<5;i++)
		 {
			 System.out.println("welcom eto the company");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
		 class Mythread extends Thread
		 {
			 Trainees t;
			 String companyname;
		 Mythread(Trainees t, String companyname) {
				super();
				this.t = t;
				this.companyname = companyname;
			}
			 public void run()
			 {
				 t.message(companyname);
			 }
		 }
		 class Synchronized
		 {
public  void main(String[] args)
	
			 {
				 Trainees java= new Trainees();
				 Mythread a= new Mythread(java,"Motivity");
				 Mythread b= new Mythread(java,"jnit");
			 }		 
		 }
	 }
}













public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
