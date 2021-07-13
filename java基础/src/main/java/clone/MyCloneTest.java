package clone;

/**
 * @ClassName MyCloneTest
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/12 上午11:09
 * @Version 1.0
 **/
public class MyCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Face face = new Face(new Teeth(4,4));
        Face face1 = (Face) face.clone();
        System.out.println("调用 clone 方法的 face 对象是否地址相等："+(face==face1));
        System.out.println("两个 face 对象的成员变量 Teeth 是否地址相等："+(face.getTeeth()==face1.getTeeth()));
        System.out.println(face);
        System.out.println(face1);
    }
}


class Face implements Cloneable {
    private Teeth teeth;

    public Face(Teeth teeth) {
        this.teeth = teeth;
    }

    public Face() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Face face = (Face) super.clone();
        face.setTeeth((Teeth) this.teeth.clone());
        return face;
    }

    public Teeth getTeeth() {
        return teeth;
    }

    public void setTeeth(Teeth teeth) {
        this.teeth = teeth;
    }

    @Override
    public String toString() {
        return "Face{" +
                "teeth=" + teeth +
                '}';
    }
}

class Teeth implements Cloneable {
    private int intNum;
    private Integer IntegerNum;

    public Teeth(int intNum, Integer integerNum) {
        this.intNum = intNum;
        IntegerNum = integerNum;
    }

    public Teeth() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teeth teeth = (Teeth) super.clone();
        teeth.setIntegerNum(new Integer(this.IntegerNum));
        return teeth;
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
        return "Teeth{" +
                "intNum=" + intNum +
                ", IntegerNum=" + IntegerNum +
                '}';
    }
}
