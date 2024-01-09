import java.util.ArrayList;
import java.util.List;

public class PlayerPart {

    public List<Boolean> toList() {
        List<Boolean> list = new ArrayList<>();
        list.add(this.x);
        list.add(this.y);
        list.add(this.z);
        list.add(this.pitch);
        list.add(this.yaw);
        list.add(this.roll);
        list.add(this.bend);
        list.add(this.bendDirection);
        list.add(this.isVisible);
        return list;
    }

    public boolean x = true;
    public boolean y = true;
    public boolean z = true;
    public boolean pitch = true;
    public boolean yaw = true;
    public boolean roll = true;
    public boolean bend = true;
    public boolean bendDirection = true;
    public boolean isVisible = true;

    public PlayerPart() {}

    public void setEnabled(boolean enabled) {
        x = enabled;
        y = enabled;
        z = enabled;
        pitch = enabled;
        yaw = enabled;
        roll = enabled;
        bend = enabled;
        bendDirection = enabled;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    public void setZ(boolean z) {
        this.z = z;
    }

    public void setPitch(boolean pitch) {
        this.pitch = pitch;
    }

    public void setYaw(boolean yaw) {
        this.yaw = yaw;
    }

    public void setRoll(boolean roll) {
        this.roll = roll;
    }

    public void setBend(boolean bend) {
        this.bend = bend;
    }

    public void setBendDirection(boolean bendDirection) {
        this.bendDirection = bendDirection;
    }

    public void isVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
}
