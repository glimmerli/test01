public class ReverseArr {

    public static void main(String[] args) {
        //定义静态数组
        int [] arr ={19,28,37,46,50};
        //循环遍历数组
//        for(int start=0,end=arr.length-1;start<end;start++,end--){
//            int temp = arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//        }
        reverse(arr);
        printArray(arr);
    }
    public  static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
    }
    public static void printArray(int []arr){
        for (int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+" , ");

            }        }

    }



}
