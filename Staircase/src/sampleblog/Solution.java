package sampleblog;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuilder buffer = new StringBuilder(n);
        
        for(int j=0;j<n;j++){
            buffer.append("#");
        }
        
        String value = buffer.toString();
        
        String[] arr = new String[n];
        
        for(int i=n;i>0;i--){
           arr[i-1] = getValue(i,n,value);
        }
        
        for(String val:arr){
            System.out.println(val);
        }
        
     }
    
    private static String getValue(int i,int n,String value){
        
        int index = (n-i);
        StringBuilder builder = new StringBuilder(value);
        
        if(index >=0) {
        	for(int ii=0;ii<index;ii++){
        		builder.setCharAt(ii, ' ');
        	}
        }
        	
        
        
        return builder.toString();
    }
}
