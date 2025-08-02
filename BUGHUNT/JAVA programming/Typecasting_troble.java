public class TypeCasting {
    public static void main(String[] args) {
        double value = 12345.6789;
        int result = (int)value;  
        System.out.println("Result: " + result);

        int big = 130;
        byte b = (byte) big;  
        System.out.println("Byte value: " + b);
    }
}
