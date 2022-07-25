package genericInterface;

public class Student<T> implements IDatabase<T>{
    @Override
    public boolean insert(T data) {
        return false;
    }

    @Override
    public boolean delete(T data) {
        return false;
    }

    @Override
    public boolean update(T data) {
        return false;
    }

    @Override
    public T select() {
        return null;
    } //diamond içindeki tür ne ise metotlarda kullanılan türler de o
    // şekilde implemente edilmek zorunda.

}
