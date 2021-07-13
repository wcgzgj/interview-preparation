package top.faroz.模板方法模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Coffee
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/1 下午11:44
 * @Version 1.0
 **/
public class Coffee extends Drink{

    @Override
    void addMeta() {
        System.out.println("正在加入咖啡粉");
    }

    @Override
    void addExtra() {
        System.out.println("正在加入白砂糖");
    }

    /**
     * 覆写钩子函数
     * 如果用户输入yes，则继续添加作料
     * 否则不添加
     * @return
     */
    @Override
    boolean needExtra() {
        String answer = getInput();
        if ("yes".equals(answer)) return true;
        return false;
    }

    public String getInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer="";
        try {
            answer = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
