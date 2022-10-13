package ra;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrInt = {3,1,5,7,4,9};
        //Sap xep mang tang dan voi giai thuat bubbe sort
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt.length-1-i; j++) {
                if (arrInt[j]>arrInt[j+1]){
                    //Doi cho 2 phan tu
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
    }
}
