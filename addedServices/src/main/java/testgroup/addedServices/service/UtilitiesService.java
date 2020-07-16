package testgroup.addedServices.service;

import testgroup.entity.MyApartment;

import java.util.List;

public interface UtilitiesService {
    List<MyApartment> allApartments();
    void add (MyApartment myApartment);
    void delete (MyApartment myApartment);
    void edit (MyApartment myApartment);
    MyApartment getById (Long id);
}
