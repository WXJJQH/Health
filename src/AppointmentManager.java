package src;

import java.util.ArrayList;

public class AppointmentManager {
    ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<Appointment>();
    }

    // 添加预约
    public void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(appointment);
        System.out.println("已为 " + patientName + " 创建预约.");
    }

    // 打印所有预约
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("目前没有预约.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("-------------------");
            }
        }
    }

    // 取消预约
    public void cancelAppointment(String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).mobilePhone.equals(mobilePhone)) {
                System.out.println("预约已取消，手机号码: " + mobilePhone);
                appointments.remove(i);
                return;
            }
        }
        System.out.println("未找到手机号码为 " + mobilePhone + " 的预约.");
    }
}
