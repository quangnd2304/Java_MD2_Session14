package ra;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrInt = {3,1,6,7,5,9};
        //Chay cac chi so phan tu cua mang chua duoc sap xep tu trai sang phai
        for (int i = 1; i < arrInt.length ; i++) {
            //Duyet cac phan tu cua mang da duoc sap xep
            int j=i-1;
            int temp = arrInt[i];
            while (j>=0&&arrInt[j]>temp){
                arrInt[j+1] = arrInt[j];
                j--;
            }
            arrInt[j+1] = temp;
        }
        System.out.print("phan tu cua mang la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }

    }
}
