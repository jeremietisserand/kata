public class LeapYear {
    public static boolean isLeap(int year) {
        if(canBeDividedBy400(year)) {
            return true;
        }
        return false;
    }

    private static boolean canBeDividedBy400(int year) {
        return year % 400 == 0;
    }
}
