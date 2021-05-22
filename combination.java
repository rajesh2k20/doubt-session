package cfc_question;
import java.util.*;
public class combination {
	
	 public static  ArrayList<ArrayList<Integer>> fun(int arr[],int index){
		
		 ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		 if(index==arr.length) {
			ArrayList<Integer> arr1=new ArrayList<Integer>(1);
		    ans.add(arr1);
			return ans; 
		 }
		 
		 ArrayList<ArrayList<Integer>> subans=fun(arr,index+1);
		
		 for(int i=0;i<subans.size();i++) {
			 ArrayList<Integer> dummy=new ArrayList<Integer>();
			 for(int j=0;j<subans.get(i).size();j++) {
				   dummy.add(subans.get(i).get(j));
			 }
			 ans.add(dummy);
			 
		 }
		 for(int i=0;i<subans.size();i++) {
			 ArrayList<Integer> dummy=new ArrayList<Integer>();
			 dummy.add(arr[index]);
			 for(int j=0;j<subans.get(i).size();j++) {
				   dummy.add(subans.get(i).get(j));
			 }
			 ans.add(dummy);
		 }
		 return ans;
		 
		 
	 }

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		ArrayList<ArrayList<Integer>> ans= fun(arr,0);
		int counter=1;
		for(int i=0;i<ans.size();i++) {
			System.out.print(counter+" .");
			System.out.println(ans.get(i));
			counter++;
		}

	}

}
