package pl.majkel.krypto.analizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMapper {
    private static final String TREND_FILE_NAME = "trendy.txt";
    private static final String OSCILLATOR_FILE_NAME = "oscylatory.txt";
    private static final String CRYPTO_PARAMS_FILE_NAME = "krypto_parametry.txt";

    public static List<String> getCryptoToStrongBuyByTrend() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(TREND_FILE_NAME));
        List<String> result = new ArrayList<String>();
        while(scanner.hasNext()){
            result.add(extractCryptoNameFromLine(scanner.nextLine()));
        }
        return result;
    }

    public static List<String> getCryptoToBuyByOscilator() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(OSCILLATOR_FILE_NAME));
        List<String> result = new ArrayList<String>();
        while(scanner.hasNext()){
            result.add(extractCryptoNameFromLine(scanner.nextLine()));
        }
        return result;
    }

    public static String extractCryptoNameFromLine(String line){
        String[] splittedFields  = line.split("\\s");
        return splittedFields[0];
    }
}
