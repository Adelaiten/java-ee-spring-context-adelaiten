import enums.FileTypes;

public class ConverterApplication {

    public static void main(String[] args) {

        int LAST_ITEM_INDEX = args.length-1;
        int TYPE_INDEX = args.length-2;

        if(args.length == 0 || !(args[LAST_ITEM_INDEX].contains(".csv"))) {
            System.out.println("No input file defined");

            System.exit(0);
        }

        String type = args[TYPE_INDEX];
        FileTypes fileType = FileTypes.getType(type);

        switch(fileType) {
            case JSON:
                break;
            case TABLE:
                break;
            case XML:
                break;
        }

    }
}
