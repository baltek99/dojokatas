import java.awt.*;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        Point position = new Point();

        if (walk.length != 10) return false;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    position.setLocation(position.x, position.y + 1);
                    break;
                case 's':
                    position.setLocation(position.x, position.y - 1);
                    break;
                case 'w':
                    position.setLocation(position.x - 1, position.y);
                    break;
                case 'e':
                    position.setLocation(position.x + 1, position.y);
                    break;
            }
        }

        return position.x == 0 && position.y == 0;
    }
}