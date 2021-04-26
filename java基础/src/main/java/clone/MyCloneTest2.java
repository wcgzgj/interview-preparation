package clone;

/**
 * @ClassName MyCloneTest2
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/12 上午11:28
 * @Version 1.0
 **/
public class MyCloneTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Face2 face = new Face2(new Teeth2(4,4));
        Face2 face1 = (Face2) face.clone();
        System.out.println("调用 clone 方法的 face 对象是否地址相等："+(face==face1));
        System.out.println("两个 face 对象的成员变量 Teeth 是否地址相等："+(face.getTeeth2()==face1.getTeeth2()));

        System.out.println(face);
        System.out.println(face1);
    }
}

class Face2 implements Cloneable {
    private Teeth2 teeth;

    public Face2(Teeth2 teeth) {
        this.teeth = teeth;
    }

    public Face2() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Teeth2 getTeeth2() {
        return teeth;
    }

    public void setTeeth2(Teeth2 teeth) {
        this.teeth = teeth;
    }

    @Override
    public String toString() {
        return "Face2{" +
                "teeth=" + teeth +
                '}';
    }
}

class Teeth2 implements Cloneable {
    private int intNum;
    private Integer IntegerNum;

    public Teeth2(int intNum, Integer integerNum) {
        this.intNum = intNum;
        IntegerNum = integerNum;
    }

    public Teeth2() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    public Integer getIntegerNum() {
        return IntegerNum;
    }

    public void setIntegerNum(Integer integerNum) {
        IntegerNum = integerNum;
    }

    @Override
    public String toString() {
        return "Teeth2{" +
                "intNum=" + intNum +
                ", IntegerNum=" + IntegerNum +
                '}';
    }
}
