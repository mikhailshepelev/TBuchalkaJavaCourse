public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        if (!isDogBarking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else return hourOfDay < 8 || hourOfDay > 22;
    }
}
