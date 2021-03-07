package com.company;

public class CustomerManager {
    ICustomerDal _customerDal;
    public CustomerManager(ICustomerDal customerDal){
        _customerDal=customerDal;
    }
    public void add(){
        //**Neden kullanılır:
        //zaten add methodu ICustomerDal'da vardı neden buraya yazdık bir daha?
        //Çünkü burada iş kodları yazılır. Burada dbye add işlemi yapılmaz, add işlemi yapılması için olan şartlar
        //burada verilir, daha sonra add işlemini asıl yapacak olan DAL katmanı çağırılır.

        //**DAL operasyonunu çağırma:
        //OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();//bunu asla yazmamalıyız! Asla bir iş katmanında
        //bu şekilde başka katmanın nesnesini yaratmamalıyız, böyle yaparsak bağımlı olmuş oluruz.

        //**Doğrusu:
        //ICustomerDal customerDal; yazalım method dışına..constractor ile referansı tutacak pointerin verilmesini zornlu kılalım
        _customerDal.add();
    }
}
