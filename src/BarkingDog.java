public class BarkingDog {

    public static boolean shouldWakeUp(boolean bark, int hour) {

        boolean up = false;

        if (hour > 23 || hour < 0 ) {
            up = false;
        } else if (bark == true){
            if (hour < 8 || hour > 22) {
                up = true;
            }else {
                up = false;
            }
        } else if (bark == false){
            up = false;
        }
        return up;
    }
}
