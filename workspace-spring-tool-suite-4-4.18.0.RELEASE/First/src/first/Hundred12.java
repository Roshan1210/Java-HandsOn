package first;
//reversing an array
public class Hundred12 {
public static void main(String [] args) {
	int[] arr= {23,90,98,56,34,12,0};
	int[] arr1=new int[arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--) {
		arr1[j]=arr[i];
				j++;
	
	}
	System.out.println();
	for(int i:arr1) {
		System.out.print(i+" ");
	}
}
}
