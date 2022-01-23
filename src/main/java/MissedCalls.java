import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public Map<LocalDateTime, String> getStorage() {
        return storage;
    }

    protected void addMissedCalls(Map<LocalDateTime, String> map, String inputPhone) {
        map.put(LocalDateTime.now(), inputPhone);
    }

    protected void printMissedCalls(Contacts contacts) {
        for (Map.Entry<LocalDateTime, String> entry : storage.entrySet()) {
            Contact contact = contacts.findContact(entry.getValue());
            System.out.println(entry.getKey().format(FORMATTER) + " -> " + (contact == null ? entry.getValue() : contact.toString()));
        }
    }

    protected void clearMissedCalls(Map<LocalDateTime, String> map) {
        map.clear();
    }

}
