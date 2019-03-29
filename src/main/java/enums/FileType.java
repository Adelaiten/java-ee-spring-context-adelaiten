package enums;

public enum FileType {
    XML,
    TABLE,
    JSON;

    public static FileType getType(String outputType) {
        FileType[] types = FileType.values();
        outputType = outputType.trim().toUpperCase();
        for(FileType type : types) {
            if(type.toString().equals(outputType)) {
                return type;
            }
        }
            return FileType.TABLE;
    }
}
