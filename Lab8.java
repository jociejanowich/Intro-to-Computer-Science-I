
// COSC 236                Clock Project
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 4/3/25
// PROGRAM-NAME: Clock
// Create a program that demonstrates a clock
//**********************************************
public class Lab8{
    private static final String RESET = "\033[0m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String BLUE = "\033[34m";
    public static void main(String [] args) throws InterruptedException{
        //hour loop
        for(int hours = 0; hours < 24; hours++){
            //minute loop
            for(int minutes = 0; minutes <= 59; minutes++){
                //seconds loop
                for(int seconds = 0; seconds <=59; seconds++){
                    System.out.print(String.format("\r" + RED + " %02d" + RESET + ":" + GREEN + "%02d" + RESET + ":" + BLUE + "%02d" + RESET, hours, minutes,seconds));
                    Thread.sleep(1000);
                    if (hours == 23 && minutes == 59 && seconds == 59){
                        hours = 0;
                        minutes = 0;
                        seconds = 0;
                    }

                }
            }
        }
    }
}