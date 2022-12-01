package spring_cources;

public class test8 {

        public static void main(String[] args) {
            int columnCount = 5;
            String star = "*";
            String space = " ";
            for (int i = 0; i < columnCount / 2; i++) {
                if (i == 0 || i == columnCount) {
                    for (int j = 0; j < columnCount; j++) {
                        System.out.print(star);
                    }
                    System.out.println();
                    continue;
                }
                for (int j = 0; j <= columnCount - i; j++) {
                    if (j != i && j != columnCount - i - 1) {
                        System.out.print(space);
                    } else {
                        System.out.print(star);
                    }
                }

            }


        }
}
