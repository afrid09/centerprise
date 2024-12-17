package sample;

public class EliminateduplicateArray {

	public static void main(String[] args) {
       int arr[]= {1,2,3,4,1,2};
       for(int i=0;i<arr.length-1;i++) {
    	   for(int j=i+1;i<arr.length;j++) {
    		   if(arr[i]==arr[j]) {
    			   System.out.println("the duplicate elements are:"+arr[i]);
    		   }
    	   }
       }
        }
			}
		
		
	

