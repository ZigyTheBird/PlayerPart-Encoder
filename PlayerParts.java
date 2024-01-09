import java.util.ArrayList;
import java.util.List;

public class PlayerParts {

    public static int x = 0;
    public static List<Boolean> list = new ArrayList<>();

    public int toInt() {
        list.addAll(this.body.toList());
        list.addAll(this.head.toList());
        list.addAll(this.torso.toList());
        list.addAll(this.rightArm.toList());
        list.addAll(this.leftArm.toList());
        list.addAll(this.rightLeg.toList());
        list.addAll(this.leftLeg.toList());
        list.addAll(this.rightItem.toList());
        list.addAll(this.leftItem.toList());

        StringBuilder binary = new StringBuilder();
        for (boolean bool : list) {
            if (bool) {
                binary.append("1");
            }
            else {
                binary.append("0");
            }
        }

        int val = 0;
        for (char c : binary.toString().toCharArray()) {
            val <<= 1;
            val += c-'0';
        }
        if (val < 100) {
            val += 512;
        }
        return val;
    }

    public PlayerPart body = new PlayerPart();
    public PlayerPart head = new PlayerPart();
    public PlayerPart torso = new PlayerPart();
    public PlayerPart rightArm = new PlayerPart();
    public PlayerPart leftArm = new PlayerPart();
    public PlayerPart rightLeg = new PlayerPart();
    public PlayerPart leftLeg = new PlayerPart();
    public PlayerPart rightItem = new PlayerPart();
    public PlayerPart leftItem = new PlayerPart();

    public PlayerParts() {}
}
