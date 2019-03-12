import enums.FileTypes;

public class ConverterApplication {

    public static void main(String[] args) {

        int LAST_ITEM_INDEX = args.length-1;
        int TYPE_INDEX = args.length-2;
        FileReader fileReader = new FileReader();
        SimpleCsvConverter csvConverter = new SimpleCsvConverter(fileReader);

        if(args.length == 0 || !(args[LAST_ITEM_INDEX].contains(".csv"))) {
            System.out.println("No input file defined");

            System.exit(0);
        }
        String type = "";

        if(TYPE_INDEX >= 0) {
            type = args[TYPE_INDEX];
        }

        String filePath = args[LAST_ITEM_INDEX];
        FileTypes fileType = FileTypes.getType(type);

        switch(fileType) {
            case JSON:
                csvConverter.convert(filePath,fileType);
                break;
            case TABLE:
                csvConverter.convert(filePath);
                break;
            case XML:
                csvConverter.convert(filePath,fileType);
                break;
        }

    }
}
