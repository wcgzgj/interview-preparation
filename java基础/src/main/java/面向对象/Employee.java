package 面向对象;

/**
 * @ClassName Employee
 * @Description 员工类
 * @Author FARO_Z
 * @Date 2021/4/28 下午2:33
 * @Version 1.0
 **/
public class Employee {
    /**
     * “员工姓名”、“员工号码”、“员工基本薪水”、“员工薪水增长率”；
     * 他的方法包括“构造方法”、“获取员工姓名”、“获取员工号码”、“获取员工基本薪水”、“计算薪水增长额”及“计算增长后的工资总额”。
     */
    private String name;
    private String phone;
    private Double salary;
    private Double rate;

    public Employee(String name, String phone, Double salary, Double rate) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.rate = rate;
    }

    /**
     * 计算增长后的工资总额
     * @return
     */
    public Double getSalaryAfterRise() {
        return salary*(1+rate);
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", rate=" + rate +
                '}';
    }
}
