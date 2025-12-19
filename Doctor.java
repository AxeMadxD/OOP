public class Doctor {
    private final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient, Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null.");
        }
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }

        if (appointment.isCompleted()) {
            throw new IllegalStateException("Cannot consult a completed appointment.");
        }

        if (appointment.getPatient() != patient) {
            throw new IllegalArgumentException("This appointment is not for the given patient.");
        }
        if (appointment.getDoctor() != this) {
            throw new IllegalArgumentException("This appointment is not assigned to this doctor.");
        }


        patient.addHistoryRecord(this, "Consultation completed at " + appointment.getTime());
    }
}