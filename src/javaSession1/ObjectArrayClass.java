package javaSession1;

import java.util.Arrays;

public class ObjectArrayClass {

	public static void main(String[] args)
	{
		Object arr[] = new Object[5];
		
		arr[0] = 20;
		arr[1] = "Ramesh";
		arr[2] = true;
		arr[3] = 100;
		arr[4] = 10.23;
		
		for(Object e:arr)
		{
			System.out.println(e);
		}
		
		for(int i = 0; i<= arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
