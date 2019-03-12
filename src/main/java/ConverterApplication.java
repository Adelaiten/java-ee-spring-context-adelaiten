import enums.FileTypes;

public class ConverterApplication {

    public static void main(String[] args) {


        String filePath = "/home/karol/codecool/Codecool-advanced-module/III SI-Week/java-ee-spring-context-Adelaiten/src/main/resources/";
        int LAST_ITEM_INDEX = args.length-1;
        int TYPE_INDEX = args.length-2;
        FileReader fileReader = new FileReader();
        SimpleCsvConverter csvConverter = new SimpleCsvConverter(fileReader);

        if(args.length == 0 || !(args[LAST_ITEM_INDEX].contains(".csv"))) {
            System.out.println("No input file defined");

            System.exit(0);
        }
        String type = "";

        filePath += args[LAST_ITEM_INDEX];
        if(TYPE_INDEX >= 0) {
            type = args[TYPE_INDEX];
        }

        FileTypes fileType;

        if(type.equals("")) {
            fileType = FileTypes.TABLE;
        }else {
            fileType = FileTypes.getType(type);

        }

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
