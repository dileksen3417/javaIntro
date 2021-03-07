package com.company;

public class KronometreThread implements Runnable {
    //com.company.KronometreThread direkt thread işlemlerini yöneteceğimiz yerdir.
    //Thread güdümlü olabilmesi için Java'nın Runnable interface'ini implemente etmemiz lazım.
    //Runnable interfacei bize run() methodunu implemente ettirdi.
    //run içindeki kodlar thread olarak koşacaktır.

    //thread nesnesine ihtiyacmıız var ve dışarıdan erişilemez olmalı
    private Thread thread;
    private String threadName; //threadleri birbirinden ayrıştırabilmemiz için gerekli

    public KronometreThread(String threadName) {
        this.threadName = threadName; //com.company.KronometreThread classım newlendiği an bana bir thread adı verilsin
        System.out.println("Oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {//threadin kendisidir.
        System.out.println("Çalıştırılıyor : " + threadName);

        //burada class çağırıp onu threadli çalıştırabiliriz ör customermanager vs gibi..
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);//ekrana yazdır 1sn bekle. yani 10snlik bir kronometre oluşturmuş oldum.
            }
        } catch (InterruptedException e) {//thread bir şekilde bozulursa..hatası oluşabilir
            System.out.println("Kesintiye uğradı: " + threadName);
        }

        System.out.println(threadName + " thread'i görevini tamamladı.");
    }

    public void start(){//threadi calıstırabilmek için yaratmak lazım. genelde bu işlem için start adı verilir.
        if(thread==null){ //threadi tutan bir referans yok ise yani henüz thread nesnesi oluşturulmadıysa
            thread = new Thread(this,threadName);//thread hangi classtan yaratılacak:this(yani bu class derim)
                                                        //thread'e isim istiyor:threadName veririm.
            thread.start();
        }
    }
}

