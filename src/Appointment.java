package src;

public class Appointment {
    String patientName;
    String mobilePhone;
    String timeSlot;
    HealthProfessional doctor;

    // 带参数的构造方法
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印预约详细信息
    public void printDetails() {
        System.out.println("患者姓名: " + patientName);
        System.out.println("手机号码: " + mobilePhone);
        System.out.println("时间段: " + timeSlot);
        System.out.print("医生信息: ");
        doctor.printDetails();
    }
}
