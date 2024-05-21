import java.lang.Thread;
import java.util.Random;

class ThreadRandom extends Thread{
	int rand_num;
	ThreadOdd to;
	ThreadEven te;
	public void run(){
		Random r = new Random();
		for(int i=0; i<5; i++){
			rand_num = r.nextInt(20);
			System.out.println("Number: "+rand_num);
			if(rand_num%2==0){
				te = new ThreadEven(rand_num);
				te.start();
			}
			else{
				to = new ThreadOdd(rand_num);
				to.start();
			}
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
		}
	}
}

class ThreadEven extends Thread{
	int num;
	public ThreadEven(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("The Square of the number is "+num*num);
	}
}

class ThreadOdd extends Thread{
	int num;
	public ThreadOdd(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("The Cube of the number is "+num*num*num);
	}
}

class ThreadSquareCube{
	public static void main(String args[]){
		ThreadRandom t = new ThreadRandom();
		t.start();
	}
}