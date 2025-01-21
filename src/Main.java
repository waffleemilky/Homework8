public class Main {
    public static void main(String[] args) {


//        Task 1

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        float[] b = {1.57F, 7.654F, 9.986F};
        int[] c = new int[1];
        c[0] = 52;

//         Task 2

        System.out.print(a[0] + ", " + a[1] + ", " + a[2]);
        System.out.println();
        System.out.print(b[0] + ", " + b[1] + ", " + b[2]);
        System.out.println();
        System.out.print(c[0]);
        System.out.println();

//        Task 3

        System.out.print(a[2] + ", " + a[1] + ", " + a[0]);
        System.out.println();
        System.out.print(b[2] + ", " + b[1] + ", " + b[0]);
        System.out.println();
        System.out.print(c[0]);
        System.out.println();

//        Task 4

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                a[i] += 1;
            if (i < a.length - 1)
                System.out.print(a[i] + ", ");
            else {
                System.out.print(a[i]);
            }
        }
    }
}