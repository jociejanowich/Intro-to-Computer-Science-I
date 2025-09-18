public class weather{
    public static void main(String [] args){
        int [] weather = {45, 44, 39, 48, 37, 46, 53};
        int sum = 0;
        int numAboveAverage = 0;
        double average;
        for(int i = 0; i < weather.length; i++){
            sum += weather[i];
        }
        average = sum / weather.length;
        System.out.println("The average temperture is: " + average + " degrees.");
        for( int j = 0; j < weather.length; j++){
            if (weather[j] > average){
                numAboveAverage++;
            }
        }
        System.out.println("There were " +  numAboveAverage + " days above average temperature");
    }
}