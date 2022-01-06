public class Arrmax {
    public static void main(String[] args) {

        //定义数组
        int [] arr ={11,22,33,58,57,46,69};
        //定义一个变量用于保存最大值
        //取数组中第一个作为变量的初始值
        int max = arr[0];
        //逐个对比，将每次对比的最大值保存到变量max中
        for (int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }

        }
        System.out.println("max:"+max);
    }
}
