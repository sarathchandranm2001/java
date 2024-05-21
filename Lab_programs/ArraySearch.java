import java.io.*;

class ArraySearch {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Array[], Size, Search_el,i;

		try {
			System.out.print("Enter size of array: ");
			Size = Integer.parseInt(dis.readLine());
			Array = new int[Size]; 
			System.out.println("Enter array elements: ");
			for(i=0; i<Size; i++) {
				Array[i] = Integer.parseInt(dis.readLine());				
			}
			System.out.println("Enter an element to search: ");
			Search_el = Integer.parseInt(dis.readLine());
			for(i=0; i<Size; i++) {
				if(Search_el==Array[i]){
					System.out.println("Element found at position "+(i+1));
					break;
				}				
			}
			if(i==Size) {
				System.out.println("Element not found!");
			}
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}