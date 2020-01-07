package Emre;

public class SecondMax {
    public static void main(String[] args) {
        int[] numbers={1,2,3,0,32,-2,43,43};
        System.out.println(secondMax(numbers));
    }
    //{1,3,2,4,5,2,10}
    public static int secondMax(int...arr){
        int max=arr[0];
        int secondMax=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i]; // max =3 second=2
            }
        }
        return secondMax;
    }
}
