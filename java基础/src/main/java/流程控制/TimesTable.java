package 流程控制;

/**
 * @ClassName TimesTable
 * @Description TimesTable
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:29
 * @Version 1.0
 **/
public class TimesTable {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }

}
