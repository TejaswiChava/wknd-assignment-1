package wkndassign1;

import java.util.ArrayList;

public class InsertionOperation {
	public static String insertionsort(int a[])
	{
	String result="";
		//ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while((j>-1)&&(a[j]>temp))
			{
				a[j+1]=a[j];
				j--;
				
				
			}
			a[j+1]=temp;
			
		
			
		}
		
		for(int k:a)
		{
		result=result+k+"";
		}
		return result;
	}
	
}
