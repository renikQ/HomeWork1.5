public class Main {
    public static void main(String[] args) {

        // задача 1
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = new int[]{3, 2, 1};

        // задача 2
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.println(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length - 1) {
                System.out.println(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray.length - 1) {
                System.out.println(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }


        // задача 3
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }

        // задача 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.println(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
    }
}