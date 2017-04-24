package wkndassign1;

public class SelectionSort {
	public static String selectionSorting(int[] array) {

		String Result="";

		int j;
		for(int i=0;i<array.length-1;i++){
			int smallindex= i;
			for ( j = i + 1; j < array.length; j++)
				if (array[j] < array[smallindex]){
					smallindex = j;
				}
			int smallnumber = array[smallindex]; 
			array[smallindex] = array[i];
			array[i] = smallnumber;

		}
		for(int k:array){
			Result+=k;
		}
		//System.out.println(Result);
		return Result;
	}

}
