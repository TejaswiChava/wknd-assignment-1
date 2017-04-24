package wkndassign1;

public class CheckArray {
	public int check(int num)
	{
		int a[]={5,6,3,2,1,7};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				return num;
				
			}
		}
		return 0;
	}

}
//O[42]