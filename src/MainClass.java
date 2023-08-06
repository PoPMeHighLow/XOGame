import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		byte option=0;
		do {
		byte[][] array = new byte[3][3];
		int x,y;
		byte player =1;
		
		for(int i = 0;i<9;i++) {
			
			boolean badInput = false;
			
			do {
				System.out.println("Na potezu je "+player+". igrac!");
				System.out.println("Unesite x koordinatu: ");
				x = scanner.nextInt();
				System.out.println("Unesite y koordinatu: ");
				y = scanner.nextInt();
				
				if(array[x][y] ==0) {
					//IGRACU JE DOZVOLJENA IGRA
					badInput = false;
					array[x][y] = player;
					
					if(player ==1) {
						player =2;
					}
					else {
						player= 1;
					}
				}
				else {
					//IGRAC JE ODIGRAO LOS POTEZ
					  badInput=true;
					  System.out.println("Uneli ste los potez, pokusajte ponovo");		
				}
			     
				
				
				
			}while(badInput);
			
			printArray(array);
			
			if(isGameOver(array)) {
				System.out.println("Igra je zavrsena!!");
				break;
			}
		}
		System.out.println("Ako zelite ponovo da igrate unesite 1 ,ako zelite da zavrsite unesite neki drugi broj!");
		option=scanner.nextByte();
		}while(option==1);
		
		scanner.close();
		

	}
	public static void printArray(byte[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				char printChar;
				
				if(array[i][j]==0) {
					printChar=' ';
				}
				else if(array[i][j]==1) {
					printChar= 'X';
				}
				else {
					printChar='O';
				}
				
				System.out.print("|"+printChar+"|");
			}
			System.out.println("");
			
			
		}
		
	}
	public static boolean isGameOver(byte[][] array) {
		
		boolean b1 = array[0][0] ==1 && array[0][1]==1 && array[0][2]==1;
		boolean b2 = array[0][0] ==2 && array[0][1]==2 && array[0][2]==2;
		
		boolean b3 = array[1][0] ==1 && array[1][1]==1 && array[1][2]==1;
		boolean b4 = array[1][0] ==2 && array[1][1]==2 && array[1][2]==2;
		
		boolean b5 = array[2][0] ==1 && array[2][1]==1 && array[2][2]==1;
		boolean b6 = array[2][0] ==2 && array[2][1]==2 && array[2][2]==2;
		
		boolean b7 = array[0][0] ==1 && array[1][0]==1 && array[2][0]==1;
		boolean b8 = array[0][0] ==2 && array[1][0]==2 && array[2][0]==2;
		
		boolean b9 = array[0][1] ==1 && array[1][1]==1 && array[2][1]==1;
		boolean b10 = array[0][1] ==2 && array[1][1]==2 && array[2][1]==2;
		
		boolean b11 = array[0][2] ==1 && array[1][2]==1 && array[2][2]==1;
		boolean b12 = array[0][2] ==2 && array[1][2]==2 && array[2][2]==2;
		
		boolean b13 = array[0][0] ==1 && array[1][1]==1 && array[2][2]==1;
		boolean b14 = array[0][0] ==2 && array[1][1]==2 && array[2][2]==2;
		
		boolean b15 = array[0][2] ==1 && array[1][1]==1 && array[2][0]==1;
		boolean b16 = array[0][0] ==2 && array[1][1]==2 && array[2][2]==2;
		
		return b1 ||b2 ||b3 ||b4 ||b5 ||b6 ||b7 ||b8 ||b9 ||b10 ||b11 ||b12 ||b13 ||b14 ||b15 ||b16;
		
		
	}
	
	

}
