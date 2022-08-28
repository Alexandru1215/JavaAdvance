package testeHomeWork.fizzBuzz;


public class Challenge {
    public static String fizzBuzz(int n) {
        String hold = "";
        int i = 0;
        if (n % 3 == 0 && n % 5 == 0)
            i = 1;
        else if (n % 5 == 0)
            i = 2;
        else if (n % 3 == 0)
            i = 3;
        else
            i = 4;
        switch (i) {
            case 1:
                hold = "FizzBuzz";
                break;
            case 2:
                hold = "Buzz";
                break;
            case 3:
                hold = "Fizz";
                break;
            case 4:
                hold = String.valueOf(n);
                break;
        }
        return hold;
    }
}