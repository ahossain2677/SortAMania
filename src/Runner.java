public class Runner {
    public static void main(String[] args) {
        //Challenge One
        int[] Arr = Team9SortCompetition.randomIntsArr(10000);

        System.out.print("Before: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        long time = System.nanoTime();
        Team9SortCompetition.challengeOne(Arr);
        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        System.out.println("Challenge One Time Taken: " + time*0.001 + "Seconds");
        System.out.println("Median: " + Team9SortCompetition.challengeOne(Arr));

        //Challenge Two
        String[] Arr = Team9SortCompetition.randomNearSort(100000);

        System.out.print("Before: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        long time1 = System.nanoTime();
        Team9SortCompetition.challengeTwo(Arr);
        System.out.println(med);
        time = System.nanoTime() - time1;

        System.out.print("After: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        System.out.println("CHallenge Two Time Taken: " + time1*0.001 + "Seconds");

        //Challenge Three
        int[] Arr = Team9SortCompetition.randomNearSort(100000);

        System.out.print("Before: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        long time2 = System.nanoTime();
        Team9SortCompetition.challengeThree(Arr);
        System.out.println(med);
        time = System.nanoTime() - time2;

        System.out.print("After: ");
        for (int num : Arr)
            System.out.print(num + " ");
        System.out.println();

        System.out.println("Challenge Three Time Taken: " + time2*0.001 + "Seconds");
        System.out.println("Median: " + Team9SortCompetition.challengeThree(Arr));
    }
}

}
