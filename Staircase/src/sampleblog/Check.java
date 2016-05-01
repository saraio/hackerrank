package sampleblog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		String s = "my name is ramkumar";
		String t = "ramkumar";
		
		String[] array1 =  s.split("\\s");
		String[] array2 = t.split("\\s");
		
		Set<String> set = new HashSet<String>();
		
		
			set.addAll(Arrays.asList(array2));
			
			for(int i = 0 ;i<array1.length;i++){
				if(set.add(array1[i])) {
					System.out.println(array1[i]);
				}
			} */
			
			
		
			int n = 6;
			List<String> list = new ArrayList<String>(n);
	        for(int i=n;i>=0;i--){
	           list.add(i,getValue(i,n));
	        }
	        
	        for(String val:list){
	            System.out.println(val);
	        }
	        
	        
	        
	     }
	    
	    private static String getValue(int i,int n){
	        StringBuffer buffer = new StringBuffer(n);
	        for(int j=0;j<n;j++){
	            buffer.append("#");
	        }
	        
	         buffer.replace(n-i,n-i,"\\s");
	        
	        
	        return buffer.toString();
	    }

}
