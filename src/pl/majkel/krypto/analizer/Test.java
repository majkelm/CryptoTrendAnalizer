package pl.majkel.krypto.analizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {
 public static void main(String args[]){
     List<String> cryptoToStrongBuyByTrend = null;
     List<String> cryptoToBuyByOscillator = null;
     List<String> cryptoBestMarketCap = null;
     try {
         cryptoToStrongBuyByTrend = FileMapper.getCryptoToStrongBuyByTrend();
         cryptoToBuyByOscillator = FileMapper.getCryptoToBuyByOscilator();
         cryptoBestMarketCap = FileMapper.getCryptoWithBestMarketCap();
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
     List<String> finalChosenCrypto = chosenCrypto;
     List<String> cryptoToInvest = new ArrayList<>();
     cryptoBestMarketCap.stream().forEach(p -> {
         if(finalChosenCrypto.contains(p)){
             cryptoToInvest.add(p);
         }
     });

     cryptoToInvest.stream().forEach(p->{
         System.out.println(p);
     });

 }
}
