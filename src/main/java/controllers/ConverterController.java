package controllers;

import enums.FileType;
import helpers.SimpleCsvConverter;

public class ConverterController {

    public void run(String args[], SimpleCsvConverter csvConverter) {
        String filePath = "src/main/resources/csv/";
        int LAST_ITEM_INDEX = args.length-1;
        ifArgsEmptyOrNotCsvExit(args, LAST_ITEM_INDEX);
        filePath += args[LAST_ITEM_INDEX];
        String type = addTypeIfExistInArgs(args);
        FileType fileType = getFileType(type);
        convertFileDependingOnFileType(csvConverter, filePath, fileType);
    }

    private void convertFileDependingOnFileType(SimpleCsvConverter csvConverter, String filePath, FileType fileType) {
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

    private FileType getFileType(String type) {
        FileType fileType;
        if(type.equals("")) {
            fileType = FileType.TABLE;
        }else {
            fileType = FileType.getType(type);

        }
        return fileType;
    }

    private String addTypeIfExistInArgs(String[] args) {
        String type = "";
        int TYPE_INDEX = args.length-2;
        if(TYPE_INDEX >= 0) {
            type = args[TYPE_INDEX];
        }
        return type;
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
