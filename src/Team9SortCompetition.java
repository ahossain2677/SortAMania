//Implement this abstract class in your own class in this project.
//Name your class Team#SortCompetition.
//e.g. Team 1 should name their class Team1SortCompetition
public abstract class
Team9SortCompetition {
	
        public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] Sort(int[] arr)
    {
        for(int x = 1; x < arr.length; x++)
        {
            for(int y = x; y > 0; y--)
            {
                if (arr[y] < arr[y-1])
                {
                    swap(arr, y,y-1);
                }
            }
        }
        return arr;
    }

	public static void bubbleSort(String[]list1) 
	{
		for(int i = 0; i < list1.length-1; i++) 
		{
			for(int j = i+1; j < list1.length; j++)
			{
				if(list1[i].compareTo(list1[j]) < 0) 
				{
					String temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}
	
	
        swapInt(arr, i + 1, right);
        return i + 1;
    }
		
	public static int challengeOne(int[] arr)
    {
        Sort(arr);
        return median(arr);
    }

    public static int[] randomIntsArr(int num)
    {
        int []arr = new int[num];
        for(int i =0; i <arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }

    public static int median(int[] arr)
    {
        int med = 0;
        if(arr.length % 2 == 0)
        {
            med = (arr[arr.length / 2 + 1] + arr[arr.length / 2]) / 2;
            return med;
        }
        else
            {
                med = arr[arr.length / 2];
                return med;
            }
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
				if (Arr[y] < Arr[y-1])
				{
					swap(Arr, y,y-1);
				}
			}
		}
		return Arr;
	}
	
public int challengeFour(int[][] arr){
     
    }


	public abstract int challengeFive(Comparable[] arr, Comparable query);

	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();
}

