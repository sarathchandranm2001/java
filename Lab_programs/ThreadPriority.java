import java.lang.Thread;

class Thread1 extends Thread{
	public void run(){
		for(int i=1; i<5; i++){
			System.out.println("In thread 1: Priority: "+getPriority()+" , "+i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
			}
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		for(int i=1; i<5; i++){
			System.out.println("In thread 2: Priority: "+getPriority()+" , "+i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
			}
		}
	}
}

class Thread3 extends Thread{
	public void run(){
		for(int i=1; i<5; i++){
			System.out.println("In thread 3: Priority: "+getPriority()+" , "+i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
			}
		}
	}
}

class ThreadPriority{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
