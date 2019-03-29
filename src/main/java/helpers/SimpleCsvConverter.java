package helpers;

import enums.FileTypes;
import factories.FormatterFactory;
import formatters.OutputFormatter;
import formatters.TableOutputFormatter;

import java.util.List;

public class SimpleCsvConverter {
    private FileReader fileReader;

    public SimpleCsvConverter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void convert(String file, FileTypes outputFormat){
        OutputFormatter outputFormatter = new FormatterFactory().createByFormat(outputFormat);
        List<String[]> data = fileReader.readData(file);
        outputFormatter.printToConsole(data);
    }

    public void convert(String file) {
        OutputFormatter outputFormatter = new TableOutputFormatter();
        List<String[]> data = fileReader.readData(file);
        outputFormatter.printToConsole(data);
    }
}
