package study0421;
import java.util.Scanner;
public class Study2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int SU = 3; //인원수 변수.
		int BUNDAN = 3; //분단수
		String name[][] = new String[BUNDAN][SU];		
		for(int i=0; i<BUNDAN; i++ )
		{			
			for(int j=0; j<SU; j++)
			{
				System.out.print((i+1)+"분단 "+(j+1)+"번학생 : ");
				name[i][j] = sc.next();				
			}			
		}		
		for(int i=0; i<BUNDAN; i++ )
		{	
			System.out.print((i+1)+"분단 / ");
			for(int j=0; j<SU; j++)
			{
				System.out.print(name[i][j]+" ");				
			}				
			System.out.println();
		}	
		

	}

}
