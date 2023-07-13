import java.util.HashMap;
import java.util.Set;

public class HashMapFun{
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        //Agregando Track #1
        tracklist.put("ilomilo", "Where did you go?\r\n" + //
                                 "I should know, but it's cold\r\n" + //
                                 "And I don't wanna be lonely\r\n" + //
                                 "So show me the way home\r\n" + //
                                 "I can't lose another life\r\n");
        //Agregando Track #2
        tracklist.put("Bad Guy", "So you're a tough guy\r\n" + //
                                 "Like it really rough guy\r\n" + //
                                 "Just can't get enough guy\r\n" + //
                                 "Chest always so puffed guy\r\n");
        //Agregando Track #3
        tracklist.put("My Boy", "My boy's being sus and he don't know how to cuss\r\n" + //
                                "He just sounds like he's tryna be his father (who are you?)\r\n" + //
                                "My boy's an ugly crier but he's such a pretty liar\r\n" + //
                                "And by that I mean he said he'd change\r\n");
        //Agregando Track #4
        tracklist.put("My Future", "'Cause I, I'm in love\r\n" + //
                                   "With my future\r\n" + //
                                   "Can't wait to meet her\r\n" + //
                                   "And I, I'm in love\r\n" + //
                                   "But not with anybody else\r\n" + //
                                   "Just wanna get to know myself\r\n");

        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key);
            System.out.println("Lyrics: " + tracklist.get(key));
        }
        
    }
}