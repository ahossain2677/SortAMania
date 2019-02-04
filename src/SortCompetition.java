//Implement this abstract class in your own class in this project.
//Name your class Team#SortCompetition.
//e.g. Team 1 should name their class Team1SortCompetition
public abstract class
SortCompetition {
	
        public static void swap(int[] arr, int i, int j) {
        	int temp = arr[i];
       	        arr[i] = arr[j];
       		arr[j] = temp;
    	}
	
	public abstract int challengeOne(int[] arr);
	
	public static int[] randomIntsArr(int num){
        	int []arr = new int[num];
        	for(int i =0; i <arr.length; i++){
      	        arr[i] = (int)(Math.random()*10000);
       		}
           return arr;
    	}
	
	public static int median(int[] arr) {
       		 int mid = 0;
       		 if(arr.length % 2 == 0) {
        	 med = (arr[arr.length / 2 + 1] + arr[arr.length / 2]) / 2;
       	 }
       	 else{
            	 med = arr[arr.length / 2];
        }
        return med;
    }

	public abstract int challengeTwo(String[] arr, String query);
	{
	string word = "";
	public class CompareTo {
      	for (x=0;x=<10000;x++){
  	randStringArr[x]=str1;
       	int var1 = str1.compareTo( str2 );
	}
      	if(var1=0)
	{
	Print x;
	}
	else
	{
	print -1
	   }
	}

	public abstract int challengeThree(int[] arr); 
	
	public static int[]randomNearSort(int num) {
		int []arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public abstract int challengeFour(int[][] arr);

	public abstract int challengeFive(Comparable[] arr, Comparable query);

	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();
}

