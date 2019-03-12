public class ConverterApplication {
    public static void main(String[] args) {
        int LAST_ITEM = args.length-1;
        if(!(args[LAST_ITEM].contains(".csv"))) {
            System.out.println("No input file defined");
            System.exit(0);
        }
    }
}
