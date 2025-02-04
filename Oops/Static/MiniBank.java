import java.util.Scanner;

class Farmer {
    int pa;
    float td;
    float si;
    static float ri;

    // si is fixed by bank so it is as static
    static {
        ri = 3f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your amount");
        pa = sc.nextInt();

        System.out.println("Please mention time duration");
        td = sc.nextFloat();
    }

    void compute() {
        si = (pa * ri * td) / 100;
    }

    void dis() {
        System.out.println("Si is " + si);
    }
}

public class MiniBank {
    public static void main(String[] args) {
        Farmer f = new Farmer();

        f.input();
        f.compute();
        f.dis();
    }
}
