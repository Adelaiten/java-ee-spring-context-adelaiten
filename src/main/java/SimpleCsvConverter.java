import enums.FileTypes;

public class SimpleCsvConverter {
    private FileReader fileReader;

    SimpleCsvConverter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    void convert(String file, FileTypes outputFormat) {
        System.out.println("I convert csv to output format");
    }

    void convert (String file) {
        System.out.println("I convert csv to output format");
    }
}
