/**
 * Created by malex on 17.03.16.
 */

// continue, break,

public class Test {
    public static void main(String[] args) {
        System.out.print("Begin ");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                //1
                  //2
                   // 3
                throw new RuntimeException();
            }
            System.out.print(i+" ");
        }
        System.out.println("End");
    }
}
