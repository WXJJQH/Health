package src;

// 全科医生类
public class GeneralPractitioner extends HealthProfessional {
    String clinic;

    // 默认构造方法
    public GeneralPractitioner() {
        super();
        clinic = "默认诊所";
    }

    // 带参数的构造方法
    public GeneralPractitioner(int id, String name, String specialty, String clinic) {
        super(id, name, specialty);
        this.clinic = clinic;
    }

    // 打印详细信息
    public void printDetails() {
        super.printDetails();
        System.out.println("诊所: " + clinic);
    }
}
