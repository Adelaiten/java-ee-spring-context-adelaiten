package factories;

import enums.FileTypes;
import formatters.JsonOutputFormatter;
import formatters.OutputFormatter;
import formatters.TableOutputFormatter;
import formatters.XmlOutputFormatter;

public class FormatterFactory {

    public OutputFormatter createByFormat(FileTypes format) {
        if(format == FileTypes.JSON) {
            return new JsonOutputFormatter();
        }else if(format == FileTypes.XML) {
            return new XmlOutputFormatter();
        }
        return new TableOutputFormatter();

    }
}
