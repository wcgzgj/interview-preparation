package 面向对象;

/**
 * @ClassName Main
 * @Description 用来测试三个对象
 * @Author FARO_Z
 * @Date 2021/4/28 下午2:25
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Car car = new Car("兰博基尼","金色");
        car.show();

        System.out.println("\n\n");

        Game game = new Game();
        game.setName("使命召唤")
                .setSize(999)
                .setStar("PG18")
                .setType("FPS")
                .setDesc("Call of Duty is the world's most popular FPS game!");
        game.printDesc();

        System.out.println("\n\n");

        Employee dio = new Employee("Dio", "13120187654", 987.6, 0.2);
        System.out.println("Dio 增长后的工资总额为:"+dio.getSalaryAfterRise());

    }

}
