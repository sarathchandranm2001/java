import java.util.*;

class NumDisp {
	public void ascend(int num) {
		if(num>0){
			ascend(num-1);
			System.out.print(num+" ");
		}
	}
	public void descend(int num) {
		if(num>0){
			System.out.print(num+" ");
			descend(num-1);
		}
	}
}

class DisplayUptoNumber {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		NumDisp obj = new NumDisp();
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		obj.ascend(num);
		System.out.print("\n");
		obj.descend(num);
	}
}