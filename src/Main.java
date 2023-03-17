public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] i = {1, 2, 3};
        double[] o = {1.57, 7.654, 9.986};
        int[] p = {758, 2_039_412, 33_333, 490};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] i = {1, 2, 3};
        double[] o = {1.57, 7.654, 9.986};
        int[] p = {758, 2_039_412, 33_333, 490};

        for (int m = 0; m < i.length; m++) {
            System.out.print(i[m]);
            if (m != i.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int m = 0; m < o.length; m++) {
            System.out.print(o[m]);
            if (m != o.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int m = 0; m < p.length; m++) {
            System.out.print(p[m]);
            if (m != p.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] i = {1, 2, 3};
        double[] o = {1.57, 7.654, 9.986};
        int[] p = {758, 2_039_412, 33_333, 490};

        for (int m = i.length-1; m >= 0; m--) {
            System.out.print(i[m]);
            if (m != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int m = o.length-1; m >= 0; m--) {
            System.out.print(o[m]);
            if (m != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int m = p.length-1; m >= 0; m--) {
            System.out.print(p[m]);
            if (m != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] i = {1, 2, 3};
        for (int m = 0; m < i.length; m++) {
            if (i[m] % 2 !=0) {
                i[m] = i[m] + 1;
            }
        }
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
    }
}