package utilz;

public class Constants {
    public static class Direction {
        public static final int RIGHT = 2;
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants{
        public static final int RUNNING = 2;
        public static final int IDLE = 0;
        public static final int JUMP = 3;
        public static final int FALLING = 4;
        public static final int HIT = 5;
        public static final int CLIMBING = 1;

        public static int GetSpiritAmount(int player_action) {
            switch (player_action) {
                case RUNNING:
                    return 11;
                case IDLE:
                    return 10;
                case JUMP:
                    return 0;
                case FALLING:
                    return 0;
                case HIT:
                    return 6;
                case CLIMBING:
                    return 4;
                default:
                    return 0;
            }
        }
    }
}
