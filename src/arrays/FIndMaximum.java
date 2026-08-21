class FindMaximum{
    public static void main(String[] args) {
    int max= Integer.MIN_VALUE;
    int arr [] = {1,2,3,4,5};

    for(int i=0;i<arr.length;i++){
        if (arr[i]>max)
        {
        max=arr[i];
        }
    }
    System.out.printf("Max number: %d",max);
    }
}
