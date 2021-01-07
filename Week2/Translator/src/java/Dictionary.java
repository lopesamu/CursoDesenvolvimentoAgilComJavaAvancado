
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary = new HashMap<>();

    public Dictionary(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        String aux[] = new String[2];

        while (true) {
            if (linha != null) {
                //System.out.println(linha);
                if (!"".equals(linha)) {
                    aux = linha.split(",");
                    dictionary.put(aux[0], aux[1]);
                }
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public String translateWord(String wordInput) {
        if (dictionary.get(wordInput) == null) {
            return wordInput;
        } else {
            return dictionary.get(wordInput);
        }
    }
}
