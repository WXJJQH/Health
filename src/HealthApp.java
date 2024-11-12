package src;

public class HealthApp {
    public static void main(String[] args) {
        // 创建医生
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "李医生", "全科医生", "市中心诊所");
        Specialist specialist1 = new Specialist(2, "张医生", "外科医生", "骨科");

        // 创建预约管理器
        AppointmentManager manager = new AppointmentManager();

        // 添加预约
        manager.createAppointment("小明", "123-456-7890", "10:00", gp1);
        manager.createAppointment("小红", "098-765-4321", "11:00", specialist1);

        // 打印所有预约
        System.out.println("当前所有预约:");
        manager.printExistingAppointments();

        // 取消预约
        manager.cancelAppointment("123-456-7890");

        // 打印更新后的预约
        System.out.println("更新后的预约列表:");
        manager.printExistingAppointments();
    }
}
