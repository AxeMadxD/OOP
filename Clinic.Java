import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clinic {
    private final String name;
    private final List<Appointment> appointments = new ArrayList<>();

    public Clinic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Appointment> getAppointments() {
        return Collections.unmodifiableList(appointments);
    }

    public Appointment scheduleAppointment(Patient patient, Doctor doctor, String time) {
        Appointment appointment = new Appointment(patient, doctor, time);
        appointments.add(appointment);
        return appointment;
    }

    public void complete(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null.");
        }
        appointment.markCompleted();
    }
}
