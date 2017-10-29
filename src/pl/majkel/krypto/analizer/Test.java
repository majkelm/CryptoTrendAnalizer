package pl.majkel.krypto.analizer;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {
 public static void main(String args[]){
     List<String> cryptoToStrongBuyByTrend = null;
     List<String> cryptoToBuyByOscillator = null;
     try {
         cryptoToStrongBuyByTrend = FileMapper.getCryptoToStrongBuyByTrend();
         cryptoToBuyByOscillator = FileMapper.getCryptoToBuyByOscilator();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }
     List<String> chosenCrypto = new ArrayList<>();
     List<String> finalCryptoToBuyByOscillator = cryptoToBuyByOscillator;
     cryptoToStrongBuyByTrend.stream().forEach(p -> {
         if(finalCryptoToBuyByOscillator.contains(p)){
             chosenCrypto.add(p);
         }
     });

     System.out.println("aaa");
 }
}
