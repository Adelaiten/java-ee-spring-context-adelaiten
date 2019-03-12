package formatters;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(String[] array : data) {
            sb.append("[");
            for(String word : array) {
                sb.append("\"" + word + "\",");
            }
            sb.append("]");
        }
        sb.append("}");

        System.out.println(sb.toString());
    }
}
