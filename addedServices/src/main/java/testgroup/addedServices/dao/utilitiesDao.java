package testgroup.addedServices.dao;

import testgroup.entity.MyApartment;

import java.util.List;

public interface utilitiesDao {
    List<MyApartment> allApartments();
    MyApartment getOne (Long id);
    void add (MyApartment myApartment);
    void delete (MyApartment myApartment);
    void edit (MyApartment myApartment);
    MyApartment getById (Long id);
}
