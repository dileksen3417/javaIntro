package com.company;

public interface IEntityRepository<T extends IEntity> {
    //<T extends IEntity> generic kısıt veriyorum diyorum ki T sadece IEntity'den türemiş classları bana yollayabilirsin.
    //generic kısıtlar vermeliyim mutlaka ki başka nesneler/değerler gelmesin.
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
