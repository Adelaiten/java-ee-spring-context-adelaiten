package formatters;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {
        String output = "";

        for(String[] array : data) {

            for(String word : array) {
                output += String.format("|%24s", word);
            }
            output+="\n";
        }

        System.out.println(output);
    }

}
