public class Exception {
    public static void processValue(int value) {
        try {
            if (value == 0) {
                throw new ArithmeticException();
            } else if (value < 0 ){
                int[] array = new int[5];
                int element = array[value];
                System.out.println("Element: " + element);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception !");
            System.out.println("Exception message: " + e.toString());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Exception message: " + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        processValue(0);
        System.out.println("----------------");
        processValue(10);
        System.out.println("----------------");
        processValue(3);
    }
}
