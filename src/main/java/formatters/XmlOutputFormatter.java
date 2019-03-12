package formatters;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\"");
        sb.append("<file-content>");
        for(String[] array : data) {
            sb.append("<line>");
            for(String word : array) {
                sb.append("<word>" + word + "</word>");
            }
            sb.append("</line>");
        }
        sb.append("</file-content>");
        System.out.println(sb.toString());
    }
}
