/***************************************************************************

                        Print the matrix in the diagonal form

***************************************************************************/
import java.util.*;

public class DiagonalPrint
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] a = new int[n][n];
		Random r = new Random();
		
		System.out.println("Array :");
		for(int x=0;x<n;x++){
		    for(int y=0;y<n;y++){
		        a[x][y] = r.nextInt(100);
		        System.out.print(a[x][y]+" ");
		    }
		    System.out.println();
		}
		
		System.out.println("\nDiagonal access :");
		
		int i=0,j=0,ti=0,tj=0,c=1;
		while(tj<n){
		    i=ti;
		    j=tj;
		    for(int x=0;x<c;x++){
		        System.out.print(a[i][j]+" ");
		        i--;
		        j++;
		    }
		    if(ti<n-1){
		        ti++;
		        c++;
		    }
		    else{
		        tj++;
		        c--;
		    }
		    System.out.println();
		}
	}
}
