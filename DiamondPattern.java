/***************************************************************************

                            Print the diamond pattern
                  
n = 7

      1       
    2 1 2     
  3 2 1 2 3   
4 3 2 1 2 3 4 
  3 2 1 2 3   
    2 1 2     
      1   

***************************************************************************/
import java.util.*;


public class DiamondPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] a = new int[n][n];
		int c=2, t=0, v=(n/2)+2;
		
		for(int j=0;j<n;j++){
		    if(j<=n/2){
		        v--;
		        t=j;
		    }
		    else{
		        v++;
		        t = (j-c);
		        c+=2;
		    }
		    
		    for(int i=0;i<n;i++){
		        if(i>=(n/2)-t && i<=(n/2)+t){
		            a[i][j] = v;
		        }
		    }
		}
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(a[i][j]==0){
		            System.out.print("  ");
		        }
		        else{
		            System.out.print(a[i][j]+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
