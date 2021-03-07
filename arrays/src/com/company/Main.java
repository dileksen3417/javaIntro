package com.company;

public class Main {

    public static void main(String[] args) {
        //stringArrayDemo();

        //doubleArray();

        //cokBoyutluDiziler();

    }

    private static void cokBoyutluDiziler() {
        //bölgelere göre sehirleri listeleyelim, yani marmara için istanbul ve bursa, doğu: tunceli erzincan
        String[][] sehirler = new String[2][2];
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[1][0]="Tunceli";
        sehirler[1][1]="Erzincan";

        for (int i = 0; i<=1; i++){
            System.out.println("****************************");
            for(int j=0; j<=1; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }

    private static void doubleArray() {
        double[] myList = {1.2, 2.3, 3.55, 5.7};
        //listedeki en büyük sayıyı bulalım
        double max=myList[0];
        for(double number:myList){
            if(max<number){
                max=number;
            }
        }
        System.out.println("Dizideki en büyük eleman: "+max);
    }

    private static void stringArrayDemo() {
        String[] ogrenciler = new String[3]; //eleman:3 index:2
        ogrenciler[0]="Dilek"; //ogrenciler dizisinin ilk elemanı-yani 0. indexindeki elemanı Dilek
        ogrenciler[1]="Altuğ";
        ogrenciler[2]="Guney";
        System.out.println("dizi uzunluğu: " + ogrenciler.length);

        for (int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }


        System.out.println("\nGerçek hayatta kullanılan dizi yazdırma yöntemi:");

        for (String ogrenci:ogrenciler){ //ogrenciler'deki her bir ogrenci -- ogrenciler'deki her bir elemanı gez
            System.out.println(ogrenci);
        }
    }
}
