package cfc_question;

public class sudoku {
    public static void solve(int [][] arr,int n,int m, int sr, int sc) {
    	if(sr==n-1 && sc== m-1) {
    		for(int i=0;i<n;i++) {
    			for(int j=0;j<m;j++) {
    				System.out.println(arr[i][j]+" ");
    			}
    			System.out.println();
    		}
    		return ;
    	}
    	int nsr=0;
    	int nsc=0;
    	if(sc==m-1) {
    		nsr=sr+1;
    		nsc=0;
    	}
    	else {
    		nsc=sc+1;
    	}
    	if(arr[sr][sc]==0 ) {
    	  for(int i=1;i<=9;i++) {
    		  if(check(arr,n,m,sr,sc,i)==true) {
    			  solve(arr,n,m,nsr,nsc);
    		  }
    	  }
    	}else {
    		solve(arr,n,m,nsr,nsc);
    	}
    }
	public  static boolean check(int[][] arr, int n, int m, int sr, int sc, int val) {
		
		for(int i=0;i<n;i++) {
			if(arr[i][sc]==val) {
				return false;
			}
		}
		for(int i=0;i<m;i++) {
			if(arr[sr][i]==val) {
				return false;
			}
		}
		
	   int toprow= (sr/3)*3;
	   int topcol= (sc/3)*3;
	   for(int i=0;i<3;i++) {
		   for(int j=0;j<3;j++) {
			   if(arr[i+sr][j+sc]==val) {
				   return false;
			   }
		   }
	   }
	   return true;
	}
	public static void main(String[] args) {
		
		int [] [] arr=new int[9][9];
		

	}

}
