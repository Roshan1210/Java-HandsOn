package first;
//Sorting in an array
public class Hundred13 {
public static void main(String[] args) {
	int arr[] = {23,67,12,10,4,2,0,54};
	int arr1[] = {23,67,12,10,4,2,0,54};
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];//ascending order
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr1[i]>arr1[j]) {//descending order
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
	}
	for(int i:arr) {
		System.out.print(i+" ");
	}
	
	
	System.out.println();
	for(int i:arr1) {
		System.out.print(i+" ");
	}
	

}
}
