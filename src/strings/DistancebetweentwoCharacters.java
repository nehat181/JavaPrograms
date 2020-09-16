package strings;

public class DistancebetweentwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,66,73,24,7,72};
		int first=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				sec=first;
				first=arr[i];
			}
			else
			if(arr[i]>sec) {
				sec=arr[i];
				
			}
		}
		System.out.println(sec);
		
		
	}

}
