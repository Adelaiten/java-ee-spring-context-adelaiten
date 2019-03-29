package controllers;

import enums.FileTypes;
import helpers.SimpleCsvConverter;

public class ConverterController {

    public void run(String args[], SimpleCsvConverter csvConverter) {
        String filePath = "src/main/resources/csv/";
        int LAST_ITEM_INDEX = args.length-1;
        int TYPE_INDEX = args.length-2;

        ifArgsEmptyOrNotCsvExit(args, LAST_ITEM_INDEX);

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


    private void ifArgsEmptyOrNotCsvExit(String[] args, int LAST_ITEM_INDEX) {
        int ARGS_LENGTH = args.length;
        int EMPTY_ARGS =0;
        if(ARGS_LENGTH == EMPTY_ARGS || !(args[LAST_ITEM_INDEX].contains(".csv"))) {
            System.out.println("No input file defined");

            System.exit(0);
        }
    }

}
