package study0421;
import java.util.Scanner;
public class Study2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int SU = 3; //�ο��� ����.
		int BUNDAN = 3; //�дܼ�
		String name[][] = new String[BUNDAN][SU];		
		for(int i=0; i<BUNDAN; i++ )
		{			
			for(int j=0; j<SU; j++)
			{
				System.out.print((i+1)+"�д� "+(j+1)+"���л� : ");
				name[i][j] = sc.next();				
			}			
		}		
		for(int i=0; i<BUNDAN; i++ )
		{	
			System.out.print((i+1)+"�д� / ");
			for(int j=0; j<SU; j++)
			{
				System.out.print(name[i][j]+" ");				
			}				
			System.out.println();
		}	
		

	}

}
