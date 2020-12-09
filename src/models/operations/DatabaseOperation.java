package models.operations;

import java.util.List;

public interface DatabaseOperation <T>{

    public List<T> selectAll();
    public T select(T t);
    public Boolean insert(T t);
    public void update(T t);
    public void delete(T t);
}
