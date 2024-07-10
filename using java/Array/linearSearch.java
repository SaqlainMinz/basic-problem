public class linearSearch {
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int index=LinearSearch(number, 13);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The index of the key is: "+index);
        }

    }

    public static int LinearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {

            if (num[i] == key) {
                return i;

            }
        }
        return -1;
    }

}
