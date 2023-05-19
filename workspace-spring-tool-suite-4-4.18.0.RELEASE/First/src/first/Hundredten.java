package first;
//max and min element in an array
public class Hundredten {
public static void main(String [] args) {
	int[] arr= {23,11,1,4,2,89,65};
	int max=0;
	int min=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max) 
		{
			max=arr[i];
		}
		
		
	}
	min=max;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min) 
		{
			min=arr[i];
	    }
	
    }
	System.out.println(max +" and "+min);
}
}
