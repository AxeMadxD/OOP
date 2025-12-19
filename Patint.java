import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patient {
    private final String name;
    private final List<String> history = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addHistoryRecord(Doctor doctor, String note) {
        history.add("Doctor: " + doctor.getName() + " | Note: " + note);
    }

    public List<String> getHistory() {
        return Collections.unmodifiableList(history);
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println(name + " history: (empty)");
            return;
        }
        System.out.println(name + " history:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + history.get(i));
        }
    }
}