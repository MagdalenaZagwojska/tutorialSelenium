public class Metody {

    public void countNumbers() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i <100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

    }

    public int getNumbers() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i <100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;

    }

    public void countNumbersParam(int number) {
        System.out.println("Number ma wartość :" + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i <number; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

    }


    public void add (int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println("Wynik to:" + sum);
    }
}
