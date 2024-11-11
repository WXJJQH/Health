package src;

public class HealthProfessional {
    int id;
    String name;
    String specialty;

    // 默认构造方法
    public HealthProfessional() {
        id = 0;
        name = "未知";
        specialty = "通用";
    }

    // 带参数的构造方法
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // 打印信息的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("名称: " + name);
        System.out.println("专业领域: " + specialty);
    }
}
