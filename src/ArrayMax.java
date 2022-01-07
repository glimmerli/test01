public class ArrayMax {
    public static void main(String[] args) {
    int [] arr={12,12,15,13,16};
    int number =getMax(arr);
        System.out.println(number);
    }
    //数组最大值的方法
    public static int getMax(int [] arr){
        int max=0;
        for(int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];

            }
        }
        return max;
    }

}
