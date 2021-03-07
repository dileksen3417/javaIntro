package com.company;

public class Product {
    // bu alanlar field veya attribute olarak adlandırılır.

    public Product(){
        System.out.println("Şartsız yapıcı blok çalıştı");
    }

    public Product(int id){
        System.out.println("Şartlı yapıcı blok çalıştı");
    }

    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    private String _code; //dışarıdan erişilemesin istiyorum private yaptım

    public String getCode(){ //code değerinin readonly yapılması için bunu yazdım,  dışarıdan çağırılabilsin diye public yaparım.
        return _code;
    }

    public void setCode(String code){
        //kontroller..
        _code=code;
    }
                //this.code=code; this benim içinde bulunduğum class demek, yani bu classdaki code alanı demek
                //bunu yapmamın amacı ise parametre olarak gelenle classtaki code karışmasın hangisi hangisi diye

                //veya değişken adını private String _code; olarak yazarım burda da _code=code; derim bu daha doğru bir kullanımdır.
                //alt çizgi ile olanlara field denir.
}
