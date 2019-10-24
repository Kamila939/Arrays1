public class hmwrktwotwo {
        public static void main(String[] args) {
            int n = 10;
            int[] mas = new int[n];
            for (int i = 0; i < n; i++) {
                mas[i] = i * i;
                System.out.println(mas[i]);
            }
        }

        public static void printArray2(int[] car) {
            double[][] mas = new double[10][];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = new double[10];
            }

            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.println("" + i + "," + j);
                }
            }
        }
        public static void printArray1(int[] number) {
            boolean[] boolArr = new boolean[true; false];
            boolean[] b = new boolean[2];
            b[0] = true;
            b[1] = false;
            System.out.println(boolArr[b])
        }

        public static void printArray(int[] color) {
            long k = 10;
            long[] mas = new long[k];
            for (long i = 0; i < k; i++) {
                mas[i] = i * i;
                System.out.println(mas[i]);
            }
        }


}
