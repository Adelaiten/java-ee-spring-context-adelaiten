import enums.FileTypes;
import helpers.SimpleCsvConverter;

public class ConverterController {

    public void run(String args[], SimpleCsvConverter csvConverter) {
        String filePath = "src/main/resources/csv/";
        int LAST_ITEM_INDEX = args.length-1;
        int TYPE_INDEX = args.length-2;


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
