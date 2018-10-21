/*
Compute how far away a listener
is from a lightning in meters.

Speed of sound = 343 m/s
Time interval between seeing the
lightning and hearing it is 7.2s
*/

class Sound {
    public static void main(String args[]) {
        double time_since_lightning = 7.2;
        int speed_of_light = 343;

        double distance = time_since_lightning * speed_of_light;

        System.out.println("The lightning is " + distance + " meters away");
    }
}