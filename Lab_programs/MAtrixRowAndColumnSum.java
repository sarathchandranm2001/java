import java.io.*;

class MatrixRowAndColumnSum {	
	public static void main(String args[]) {

		DataInputStream dis;
		dis = new DataInputStream(System.in);
		int Matrix[][], Row_Size, Column_Size, Row_Sum, Column_Sum, temp, i, j;

		try {
			System.out.print("Enter row size of matrix: ");
			Row_Size = Integer.parseInt(dis.readLine());
			System.out.print("Enter column size of matrix: ");
			Column_Size = Integer.parseInt(dis.readLine());
			Matrix = new int[Row_Size+1][Column_Size]; 
			System.out.println("Enter matrix elements: ");
			for(i=0; i<Row_Size; i++) {
				for(j=0; j<Column_Size; j++){
					System.out.print("\nElement ["+(i+1)+"]"+"["+(j+1)+"]"+" : ");
					Matrix[i][j] = Integer.parseInt(dis.readLine());				
				}
			}
			for(i=0; i<Row_Size; i++) {
				Row_Sum = 0;
				for(j=0; j<Column_Size; j++){
					if(i == 0) {
						Matrix[Row_Size][j] = 0;
					}
					System.out.print(Matrix[i][j]+" ");
					Matrix[Row_Size][j] = Matrix[Row_Size][j] + Matrix[i][j];
					Row_Sum = Row_Sum + Matrix[i][j];
				}
				System.out.print(" | "+Row_Sum+"\n");
			}
			for(i=0; i<Column_Size; i++){
				System.out.print("--");
			}
			System.out.print("\n");
			for(i=0; i<Column_Size; i++){
				System.out.print(Matrix[Row_Size][i]+" ");
			}
		}
		catch (Exception e) {
			System.out.println("Error: "+e);
		}

	}

}