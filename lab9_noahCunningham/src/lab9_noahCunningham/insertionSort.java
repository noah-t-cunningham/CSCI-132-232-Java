package lab9_noahCunningham;

public class insertionSort {
	
	
	
	public static int[] sortAscending(int[] data){
		
		int n = data.length;
			for(int i = 1;i<n; i++) {
				int spot = data[i];
				int j = i;
				while(j > 0 && data[j-1]>spot) {
					data[j] = data[j-1];
					j--;
				}
				data[j] = spot;
			}
		return data;
	}
	
	public static int[] sortDescending(int[] data){
		
		int n = data.length;
			for(int i = 1;i<n; i++) {
				int spot = data[i];
				int j = i;
				while(j>0 && data[j-1]<spot) {
					data[j] = data[j-1];
					j--;
				}
				data[j] = spot;
			}
			return data;
	}
}
