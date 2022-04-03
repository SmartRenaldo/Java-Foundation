package EducationalAdministrationManagement;

public interface Data <E>{
    void add(E e);
    void delete(E e);
    void update(E e);
    E query(int num);
}
