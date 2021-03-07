package com.company;

public class CustomerDal implements IEntityRepository<Customer> {
    //IEntityRepository'i Customer nesnesi için kullanmak istiyorum diyorum.
    // <Customer> demezsem generic olarak kullanmamış olurum ve hatalı olur.
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
