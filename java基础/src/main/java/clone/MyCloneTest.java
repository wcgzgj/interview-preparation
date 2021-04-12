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
        System.out.println(face==face1);
        System.out.println(face.getTeeth()==face1.getTeeth());
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
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teeth{" +
                "intNum=" + intNum +
                ", IntegerNum=" + IntegerNum +
                '}';
    }
}
