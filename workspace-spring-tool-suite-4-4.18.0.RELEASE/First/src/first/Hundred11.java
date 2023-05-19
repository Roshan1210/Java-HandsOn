package first;

public class Hundred11 {
public static void main(String [] args) {

	int[] arr= {23,11,1,4,2,89,65,12,63,90};
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
	
	int secondSmallest=max;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>min && arr[i]<secondSmallest) 
		{
			secondSmallest=arr[i];
	    }
	
    }
	
	
	System.out.println(max +" and "+min+" and "+secondSmallest);
}
}
