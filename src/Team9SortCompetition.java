//Implement this abstract class in your own class in this project.
//Name your class Team#SortCompetition.
//e.g. Team 1 should name their class Team1SortCompetition
public abstract class
Team9SortCompetition {
	
        private void swap(int[] arr, int i, int j) {
        	int temp = arr[i];
       	        arr[i] = arr[j];
       		arr[j] = temp;
    	}
	
	private void bubbleSort(int[] arr){
        int x = 1;
        while (x !=0){
            x=0;
            for (int i=0; i<arr.length-1; i++){
                if (arr[i] > arr[i + 1]) {
                    swap(arr, arr[i], arr[i+1]);
                    x++;
                }
            }
        }
    }
	
	public int challengeOne(int[] arr){
		bubbleSort(arr);
		median(arr);
	}
	
	public static int[] randomIntsArr(int num){
        	int []arr = new int[num];
        	for(int i =0; i <arr.length; i++){
      	        arr[i] = (int)(Math.random()*10000);
       		}
           return arr;
    	}
	
	public static int median(int[] arr) {
       		 int med = 0;
       		 if(arr.length % 2 == 0) {
        	 med = (arr[arr.length / 2 + 1] + arr[arr.length / 2]) / 2;
       	 }
       	 else{
            	 med = arr[arr.length / 2];
        }
        return med;
    }

    public int challengeTwo(String[] arr, String query);
        {
		
     bubbleSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].compareTo(theString) == 0)
			{
				return i;
			}
		}
		return -1;
        }

	public static int challengeThree(int[] SortChallengeThree)
	{
		int mid = 0;
       		if(Arr.length % 2 == 0) 
		{
			med = (Arr[Arr.length / 2 + 1] + Arr[Arr.length / 2]) / 2;
		}
		else
		{
			med = Arr[Arr.length / 2];
		}
		return med;
	}
	
	public static int[] randomNearSort(int num) 
	{
		randomIntsArr(num);
		for(int i = 0; i < 80000; i++) 
		{
			for (int n = 0; n < Arr.length - 1; n++) 
			{
				if (Arr[n] > Arr[n + 1]) 
				{
					swap(Arr, n, n + 1);
				}
			}
		}
		return Arr;
	}
	
	public static int[] SortChallengeThree(int num);
	{
		randomNearSort(num);
		for(int x = 1; x < Arr.length; x++)
		{
			for(int y = x; y > 0; y--)
			{
				if (intArr[y] < Arr[y-1])
				{
					swap(Arr, y,y-1);
				}
			}
		}
		return Arr;
	}

	public static int challengeFour(int[][] arr)
	{
		
	}


	public abstract int challengeFive(Comparable[] arr, Comparable query);

	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();
}
