package com.company;

public class Main {

    public static void main(String[] args) {
	// Exception Handling için try catch bloklarını kullanılırz.

        String isim="Dilek";
        int yas =25;
        //yas=isim; //bu daha compiler bile edilemeyen bir hata yani proje ayağa kalkmaz. bu tip hatalar için try-cache kullanmayız.


        int[] sayilar1= new int[]{1,2,3};
        System.out.println(sayilar1[5]); //burada compülerda hata vermiyor kod derleniyor fakat proje ayağa kalkıp çalışırken hata fırlatıyor.
                                        //bu hata programın kırılmasına neden olur yani hata fırlattıgı yerde program durur
                                        //işte bu tür durumlarda try cache kullanırız.  //ArrayIndexOutOfBoundsException

        //sayilar diye dizi oluşturduk ama aslında bu listeler bize önyüzden/databaseden vs herhangi bir veri kaynagından geleceği
        //için hiç veride gelmeyebilir uzun bir veri de gelebilir tipte uymayabilir
        //o yüzden hata vermesi mümkün olan kodları try blogu içine alırız

        try{ //çalıştırmayı dener
            int[] sayilar= new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch(ArrayIndexOutOfBoundsException exception){ //tryda hata çıkması durumunda burası çalışır, yukarıda program kırılırken artık bu yapı ile kırılmaz
            System.out.println("Bir Array tipli hata oluştu.");
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println("Bir String tipli hata oluştu.");
        }catch(Exception exception){ //Herhangi bir hata için çalışır.
            System.out.println("Loglandı : " + exception);
        }finally { //son çalışan blok,ister try ister catch calıssın finally blogu her türlü çalışır!
            System.out.println("Ben her türlü çalışırım.");
        }

        //ÖNEMLİ!!!!
       // catch(ArrayIndexOutOfBoundsException exception)  // dersek catch bloguna girer.
       // catch(StringIndexOutOfBoundsException exception) //dersek catch bloguna girmez ve program kırılır. Çünkü try blogundan gelen
                                                         //hata String hatası degil Array hatasıdır.
    }
}
