package cfc_question;

import java.util.Scanner;

import java.util.*;
public class stack {
	static int counter=0;
	public static void displayBoard(int[][] board) {
		System.out.println(counter +" .");
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j]);
            }

            System.out.println();
        }
        counter++;
    }
	 public static void  nKnights(int[][] board,int i,int j,int n,int m){
	       // System.out.println("i"+i+"j"+j);
	        /*
	        if(i==board.length && j== board[0].length){
	           displayBoard(board);
	           System.out.println();
	           return;
	        }*/
	       
	        if(n==m ){
	            displayBoard(board);
	            System.out.println();
	            return;
	        }
	        
	        
	       // System.out.println("i"+i+"j"+j+"outside");
	       
	           // System.out.println("i"+i+"j"+j);
	          
	            for(int k= i;k<4;k++) {
	              for(int p= 0;p<4;p++) {
	            	  if(p<j && k==i) {
	            		  continue;
	            	  }
	            	  if(isSafe(board,k,p)==true){

	   	               // System.out.println("issafe i"+i+"j"+j);
	   	                board[k][p] = 1;
	   	                nKnights(board,k, p,n+1,m);
	   	                board[k][p]=0;
	   	                
	   	            }
	              }
	            }
	        
	        

	    }
	    public static boolean isSafe(int[][]board,int i,int j){
	    	if(board[i][j]==1) {
	    		return false;
	    	}
	        final int[][] moves = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 },
	                { 2, 1 } };
	        for (int[] move : moves) {
	            /*xpos = this.x + move[0];
	            ypos = this.y + move[1];*/
	            if(i + move[0] >= 0 && j + move[1] >= 0 && i + move[0]  <= board.length-1 && j + move[1] <= board[0].length-1){
	               if(board[i + move[0]][j + move[1]] == 1){
	                   return false;
	               }
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		 int[][] board= new int[4][4];
	     nKnights( board,0,0,0,4);
	}

}
