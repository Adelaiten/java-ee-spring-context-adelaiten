package factories;

import enums.FileType;
import formatters.JsonOutputFormatter;
import formatters.OutputFormatter;
import formatters.TableOutputFormatter;
import formatters.XmlOutputFormatter;

public class FormatterFactory {

    public OutputFormatter createByFormat(FileType format) {
        if(format == FileType.JSON) {
            return new JsonOutputFormatter();
        }else if(format == FileType.XML) {
            return new XmlOutputFormatter();
        }
        return new TableOutputFormatter();

    }
}
