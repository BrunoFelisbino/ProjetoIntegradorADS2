package br.com.projeto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoIntegradorApplication implements CommandLineRunner {

    @Autowired // Injeção da interface de persistência de dados
    CsvQuestao6Repository repository6;
    @Autowired
    CsvQuestao7Repository repository7;
    @Autowired
    CsvQuestao8Repository repository8;
    @Autowired
    CsvQuestao9Repository repository9;
    @Autowired
    CsvQuestao10Repository repository10;
    @Autowired
    CsvQuestao11Repository repository11;

    private static final String VIRGULA = ";";

    public static void main(String[] args) {
        SpringApplication.run(ProjetoIntegradorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        BufferedReader reader6 = new BufferedReader(new InputStreamReader(new FileInputStream("questao6.csv"))); // Leitura do arquivo CSV
        String linha6 = null;

        BufferedReader reader7 = new BufferedReader(new InputStreamReader(new FileInputStream("questao7.csv")));// Leitura do arquivo CSV
        String linha7 = null;

        BufferedReader reader8 = new BufferedReader(new InputStreamReader(new FileInputStream("questao8.csv"))); // Leitura do arquivo CSV
        String linha8 = null;

        BufferedReader reader9 = new BufferedReader(new InputStreamReader(new FileInputStream("questao9.csv"))); // Leitura do arquivo CSV
        String linha9 = null;

        BufferedReader reader10 = new BufferedReader(new InputStreamReader(new FileInputStream("questao10.csv"))); // Leitura do arquivo CSV
        String linha10 = null;

        BufferedReader reader11 = new BufferedReader(new InputStreamReader(new FileInputStream("questao11.csv"))); // Leitura do arquivo CSV
        String linha11 = null;

        while ((linha6 = reader6.readLine()) != null) {
            String[] dadosUsuario = linha6.trim().split(VIRGULA);
            if (dadosUsuario.length > 1) {
                CsvQuestao6 response = new CsvQuestao6(0, Integer.parseInt(dadosUsuario[0]),
                        Integer.parseInt(dadosUsuario[1]));

                repository6.save(response); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader6.close(); // Fechando arquivo CSV

        while ((linha7 = reader7.readLine()) != null) {
            String[] dadosUsuario7 = linha7.trim().split(VIRGULA);
            if (dadosUsuario7.length > 1) {
                CsvQuestao7 response7 = new CsvQuestao7(0, dadosUsuario7[0], Integer.parseInt(dadosUsuario7[1]));

                repository7.save(response7); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader7.close(); // Fechando arquivo CSV

        while ((linha8 = reader8.readLine()) != null) {
            String[] dadosUsuario8 = linha8.trim().split(VIRGULA);
            if (dadosUsuario8.length > 1) {
                CsvQuestao8 response8 = new CsvQuestao8(0, dadosUsuario8[0], Integer.parseInt(dadosUsuario8[1]));

                repository8.save(response8); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader8.close(); // Fechando arquivo CSV

        while ((linha9 = reader9.readLine()) != null) {
            String[] dadosUsuario9 = linha9.trim().split(VIRGULA);
            if (dadosUsuario9.length > 1) {
                CsvQuestao9 response9 = new CsvQuestao9(0, dadosUsuario9[0], Integer.parseInt(dadosUsuario9[1]));

                repository9.save(response9); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader9.close(); // Fechando arquivo CSV

        while ((linha10 = reader10.readLine()) != null) {
            String[] dadosUsuario10 = linha10.trim().split(VIRGULA);
            if (dadosUsuario10.length > 1) {
                CsvQuestao10 response10 = new CsvQuestao10(0, dadosUsuario10[0], Integer.parseInt(dadosUsuario10[1]));

                repository10.save(response10); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader10.close(); // Fechando arquivo CSV

        while ((linha11 = reader11.readLine()) != null) {
            String[] dadosUsuario11 = linha11.trim().split(VIRGULA);
            if (dadosUsuario11.length > 1) {
                CsvQuestao11 response11 = new CsvQuestao11(0, dadosUsuario11[0], Integer.parseInt(dadosUsuario11[1]));

                repository11.save(response11); // Salvando dados no banco de dados nas colunas (id, data, quantidade)
            }
        }
        reader11.close(); // Fechando arquivo CSV
    }
}
