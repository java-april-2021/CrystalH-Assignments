import java.util.HashMap;
import java.util.HashMap;

public class HashmatiqueTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Church", "I pray on my way to the liquor store, that they lock the door.");
        trackList.put("No Lives Matter", "Screaming from the rooftops, 'No lives matter.'");
        trackList.put("Fake Woke", "They so fake woke, facts don't care 'bout feelings.");
        trackList.put("People So Stupid", "People so stupid, people so dumb.");

        System.out.println(trackList.get("Church"));

        for (HashMap.Entry<String, String> entry: trackList.entrySet()) {
            System.out.println("Track: " + entry.getKey() + " Lyrics: " + entry.getValue());
        }
    }
}
