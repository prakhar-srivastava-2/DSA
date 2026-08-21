class SecondLargest{
    public static void main(String[] args) {

        int arr[] = {1,3,2,4,5};
        int max = Integer.MIN_VALUE;
        int min;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<max && arr[i]>=min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}