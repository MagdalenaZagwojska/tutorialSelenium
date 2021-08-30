public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
        /*int result = metody.getNumbers();
        int result2 = result * 2;
        System.out.println("Rezultat po mnożeniu to: " + result2);*/

        metody.countNumbersParam(10);
        metody.countNumbersParam(23);

        metody.add(1,2);
        metody.add(9,10);

    }
}
