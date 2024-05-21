import java.io.*;

class ArraySort {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Array[], Size, temp, i, j;

		try {
			System.out.print("Enter size of array: ");
			Size = Integer.parseInt(dis.readLine());
			Array = new int[Size]; 
			System.out.println("Enter array elements: ");
			for(i=0; i<Size; i++) {
				Array[i] = Integer.parseInt(dis.readLine());				
			}
			for(i=0; i<Size; i++) {
				for(j=0; j<Size-i-1; j++){
					if(Array[j] > Array[j+1]) {
						temp = Array[j];
						Array[j] = Array[j+1];
						Array[j+1] = temp;
					}				
				}
			}
			System.out.print("Sorted Array: ");
			for(i=0; i<Size; i++) {
				System.out.print(Array[i]+" ");
			}
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}