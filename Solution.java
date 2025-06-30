class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[] = new int[num_people];
        int index = 0;
        int add = 1;

        while(true){
            arr[index] = arr[index] + add;
            index++;
            candies = candies - add;
            add++;

            if(index >= arr.length){
                index = 0;
            }

            if(candies < add){
                arr[index] = arr[index] + candies;
                break;
            }
        }

        return(arr);
    }
}
