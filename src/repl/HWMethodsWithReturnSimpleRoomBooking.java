package repl;

public class HWMethodsWithReturnSimpleRoomBooking {
    public static void main(String[] args) {
//To book  a room first it needs to be available for rent and make sure its available at the date
// selected:
//the room is already booked between 7/1/2018 - 7/8/2018 and not available
//accepting bookings only for year of 2018
        System.out.println(simpleRoomBook(false,2,1,2018));
    }
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if (isAvailable==true && month == 7 && day<=8 && day>=1 && year == 2018){
            return false;
        }
        return true;
    }
}