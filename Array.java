import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the"+n+"elements");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i] > max)
				max=array[i];
		}
		System.out.println("the max element is "+max);
	}

}
