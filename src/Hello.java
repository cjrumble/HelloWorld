/* access modifiers public, private, final */
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello Chris!");

        int myFirstNumber = (5 + 10) + (2 * 10); /* expression - construct that evaluates into a single value */
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.println(myTotal);
        System.out.println(myLastOne);
    }
}
/* exit code 0 means NO PROBLEMO! */