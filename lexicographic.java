package cfc_question;
import java.util.*;
public class lexicographic {

	
	public static boolean lexi(int val ,int n) {
		
		if(val<=n) {
			System.out.println(val);
		}
		else {
			return false;
		}
		int nval=val*10;
		for(int i=0;i<=9;i++ ) {
		 boolean  ans=	lexi(nval+i,n);
		 if(ans==false) {
			 return true;
		 }
		}
		return true;
	}
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int i=1;i<=9;i++) {
	    lexi(i,n);	 
	 }

	}

}
