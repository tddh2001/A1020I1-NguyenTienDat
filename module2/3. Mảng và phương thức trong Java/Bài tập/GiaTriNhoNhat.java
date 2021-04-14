public class GiaTriNhoNhat {
    public static void main(String[] args) {
        int[] numb = {1,2,3,4,5,6,7,8,9};
        int min = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min){
                min = numb[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " +min);
    }
}
