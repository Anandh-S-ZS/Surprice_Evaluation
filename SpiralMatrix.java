/***************************************************************************

                           Print the spiral matrix



***************************************************************************/
import java.util.*;

public class SpiralMatrix
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] a = new int[n][n];
		
		int i=0,j=0;
		int vc=n,vt=0;
		int c=0,t=1,d=0;
		
		for(int val=1;val<=n*n;val++){
		    a[i][j] = val;
		    vt++;
		    if(vt==vc){
		        c++;
		        vt=0;
		        d++;
		        d = d%4;
		    }
		    if(c==t){
		        t=2;
		        c=0;
		        vc--;
		    }
		    
		    switch(d){
		        case 0:
		            j++;
		            break;
		        case 1:
		            i++;
		            break;
		        case 2:
		            j--;
		            break;
		        case 3:
		            i--;
		            break;
		    }
		}
		
		for(int x=0;x<n;x++){
		    for(int y=0;y<n;y++){
		        System.out.print(a[x][y]+" ");
		    }
		    System.out.println();
		}
	}
}
