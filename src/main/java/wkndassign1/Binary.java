package wkndassign1;
public class Binary {
public int check(int num)
{
	int a[]={2,3,4,5,6,7,8,9};
	int first=0,last=a.length-1;
	int middle=(first+last)/2;
	while(first<=last)
	{
		if(a[middle]<num)
		{
			middle=middle+1;
			last=middle;
			middle=(first+last)/2;
		}
		else if(a[middle]==num)
		{
	return num;
		}
		else{
			middle=middle-1;
			last=middle;
			middle=(first+last)/2;
		}
	
	}
return 0;
	
	
	
	
}

}
//O(7)