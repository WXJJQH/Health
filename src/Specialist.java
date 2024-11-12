package src;

// 专科医生类
public class Specialist extends HealthProfessional {
    String expertise;

    // 默认构造方法
    public Specialist() {
        super();
        expertise = "普通";
    }

    // 带参数的构造方法
    public Specialist(int id, String name, String specialty, String expertise) {
        super(id, name, specialty);
        this.expertise = expertise;
    }

    // 打印详细信息
    public void printDetails() {
        super.printDetails();
        System.out.println("专长: " + expertise);
    }
}