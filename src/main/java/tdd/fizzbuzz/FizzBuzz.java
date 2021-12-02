package tdd.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {

    }
    public String countOff(int order) {
        if(order%(3*5*7) == 0){
            return "FizzBuzzWhizz";
        }else if(order%(3*5) == 0){
            return "FizzBuzz";
        }else if(order%(3*7) == 0){
            return "FizzWhizz";
        }else if(order%(5*7) == 0){
            return "BuzzWhizz";
        }else if(order%3 == 0){
            return "Fizz";
        }else if(order%5 == 0){
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
