public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic("City Clinic");
        Doctor doctor = new Doctor("Dr. Smith");
        Patient patient = new Patient("John Doe");

        Appointment appointment = clinic.scheduleAppointment(patient, doctor, "2025-12-19 14:00");

        doctor.consult(patient, appointment);
        clinic.complete(appointment);

        System.out.println(appointment);
        patient.printHistory();
    }
}