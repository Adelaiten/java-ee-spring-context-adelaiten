package enums;

public enum FileTypes {
    XML,
    TABLE,
    JSON;

    public static FileTypes getType(String outputType) {
        FileTypes[] types = FileTypes.values();
        outputType = outputType.trim().toUpperCase();
        for(FileTypes type : types) {
            if(type.toString().equals(outputType)) {
                return type;
            }
        }
            return FileTypes.TABLE;
    }
}
