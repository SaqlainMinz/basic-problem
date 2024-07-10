public class linearSearch {
    public static void main(String[] args) {
        // int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        // int index = LinearSearch(number, 13);
        // if (index == -1) {
        //     System.out.println("Not Found");
        // } else {
        //     System.out.println("The index of the key is: " + index);
        // }
        String menu[] = { "Rawa", "Idli", "Dosa", "Uttapam", "Chilla", "Wada" };
        int menuIndex=llinearSearch(menu, "Dosa");
        if(menuIndex==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The Index Of the menu is: "+menuIndex);
        }


    }

    public static int llinearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {

            if (menu[i] == key) {
                return i;

            }
        }
        return -1;
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
