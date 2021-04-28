package 人工智障;


import java.util.Scanner;

/**
 * @ClassName DumbAi
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/27 下午11:49
 * @Version 1.0
 **/
public class DumbAi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String que = sc.next();
            que=que.replace("吗","");
            que=que.replace("我","我也");
            //英文符号
            que=que.replace("?","!");
            //中文符号
            que=que.replace("？","！");

            System.out.println(que);
        }
    }
}
