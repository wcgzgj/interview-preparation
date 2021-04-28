package 流程控制;

/**
 * @ClassName PrintGraph
 * @Description 打印三个图形
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:22
 * @Version 1.0
 **/
public class PrintGraph {
    public static void main(String[] args) {
        System.out.println("图 1：");
        printPic1();
        System.out.println("\n\n");

        System.out.println("图 2：");
        printPic2();
        System.out.println("\n\n");

        System.out.println("图 3：");
        printPic3();
        System.out.println("\n\n");
    }

    public static void printPic1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printPic2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPic3() {
        for (int i = 0; i < 5; i++) {
            String line="";
            for (int j = 0; j < 4 - i; j++) {
                line+=" ";
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                line+="*";
            }
            System.out.println(line);
        }
    }
}
