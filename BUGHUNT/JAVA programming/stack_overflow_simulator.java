public class StackOverflowSim {
    public static void main(String[] args) {
        callMe();
    }

    static void callMe() {
        System.out.println("Calling...");
        callMe(); 
    }
}
