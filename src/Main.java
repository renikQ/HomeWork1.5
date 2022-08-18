public class Main {
    public static void main(String[] args) {

        // задача 1
        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] thirdArray = new int[] {3, 2, 1};

        // задача 2
        System.out.println(firstArray[0] + ", " + firstArray[1] + ", " + firstArray[2]);
        System.out.println(secondArray[0] + ", " + secondArray[1] + ", " + secondArray[2]);
        System.out.println(thirdArray[0] + ", " + thirdArray[1] + ", " + thirdArray[2]);

        // задача 3
        System.out.println(firstArray[2] + ", " + firstArray[1] + ", " + firstArray[0]);
        System.out.println(secondArray[2] + ", " + secondArray[1] + ", " + secondArray[0]);
        System.out.println(thirdArray[2] + ", " + thirdArray[1] + ", " + thirdArray[0]);

        // задача 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        System.out.println(firstArray[0] + ", " + firstArray[1] + ", " + firstArray[2]);
    }
}