public class makeGuesses{
    public static void main(String[] args){
        try {
            int [] numbers = {1,2,3};
            System.out.println(numbers[10]);
        } catch (Exception r) {
            System.out.println("An error occurred, Try Again: " + r.getMessage());
        } finally{
            System.out.println("Thank you!!!");
        }
    }
}