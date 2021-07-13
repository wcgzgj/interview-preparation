package 面向对象;

/**
 * @ClassName Game
 * @Description 游戏类，因为成员变量太多，我用了下建造者模式
 * @Author FARO_Z
 * @Date 2021/4/28 下午2:27
 * @Version 1.0
 **/
public class Game {
    //游戏名，类型，大小，星级，
    // 介绍等
    private String name;
    private String type;
    private Integer size;
    private String star;
    private String desc;

    public Game(String name, String type, Integer size, String star, String desc) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.star = star;
        this.desc = desc;
    }

    public Game() {
    }

    public String getName() {
        return name;
    }

    public Game setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Game setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public Game setSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getStar() {
        return star;
    }

    public Game setStar(String star) {
        this.star = star;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Game setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public void printDesc() {
        System.out.println("游戏介绍:");
        System.out.println(this.desc);
    }
}
