package 划拳游戏;


import org.junit.validator.PublicClassValidator;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Machine
 * @Description 划拳游戏
 * @Author FARO_Z
 * @Date 2021/4/28 下午5:38
 * @Version 1.0
 **/
public class Machine {
    private int machine=0;
    private int player=0;
    private Scanner sc = new Scanner(System.in);

    public int getRandom() {
        return new Random().nextInt(3);
    }

    public void play() {
        int playerInput=-1;
        String input="";
        while (playerInput ==-1) {
            System.out.println("请输入 \"石头\"、\"剪刀\" 或者 \"布\":");
            input = sc.next();
            playerInput = getPlayerInput(input);
            if (playerInput==-1) {
                System.out.println("输入错误");
            }
        }
        int machineInput = getRandom();
        System.out.println("您输入的是:"+input);
        System.out.println("机器输入的是:"+getMachineInput(machineInput));
        judgeOnePlayWin(machineInput,playerInput);
    }

    private void machineWin() {
        machine++;
    }

    private void playerWin() {
        player++;
    }

    public String getWinner() {
        if (machine>player) return "机器";
        else if (machine<player) return "玩家";
        else return "平局";
    }

    public int getPlayerInput(String str) {
        switch (str) {
            case "石头":
                return 0;
            case "剪刀":
                return 1;
            case "布":
                return 2;
            default:
                return -1;
        }
    }

    public String getMachineInput(int num) {
        switch (num) {
            case 0:
                return "石头";
            case 1:
                return "剪刀";
            case 2:
                return "布";
            default:
                return "";
        }
    }

    public void judgeOnePlayWin(int machine,int player) {
        //平局，谁都不加分
        if (machine==player) return;
        if (machine==0 && player==1) machineWin();
        else if (machine==0 && player==2) playerWin();
        else if (machine==1 && player==0) playerWin();
        else if (machine==1 && player==2) machineWin();
        else if (machine==2 && player==0) machineWin();
        else if (machine==2 && player==1) playerWin();
    }

    public int getMachine() {
        return machine;
    }

    public int getPlayer() {
        return player;
    }
}
