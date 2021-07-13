package 划拳游戏;

/**
 * @ClassName Main
 * @Description 启动类
 * @Author FARO_Z
 * @Date 2021/4/28 下午5:38
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        for (int i = 0; i < 5; i++) {
            machine.play();
            System.out.println("\n");
        }
        System.out.println("机器得分:"+machine.getMachine());
        System.out.println("玩家得分:"+machine.getPlayer());
        System.out.println("游戏结束，胜者是:"+machine.getWinner());
    }
}
