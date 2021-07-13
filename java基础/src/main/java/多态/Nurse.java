package 多态;

/**
 * @ClassName Nurse
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/28 下午4:31
 * @Version 1.0
 **/
public class Nurse extends Person{
    private String hospital;

    public Nurse(String name, int age, String hospital) {
        super(name, age);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
