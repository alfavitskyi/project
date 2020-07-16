package testgroup.addedServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.addedServices.dao.utilitiesDao;
import testgroup.addedServices.dao.utilitiesDaoImpl;
import testgroup.entity.MyApartment;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class utilitiesServiceImpl implements UtilitiesService {
    private utilitiesDao utilitiesDao1 = new utilitiesDaoImpl();
    @Autowired
    private UtilitiesService utilitiesService;
    @Override
    @Transactional
    public List<MyApartment> allApartments() {
        return utilitiesDao1.allApartments();
    }

    @Override
    public void add(MyApartment myApartment) {
       utilitiesDao1.add(myApartment);
    }

    @Override
    public void delete(MyApartment myApartment) {
       utilitiesDao1.delete(myApartment);
    }

    @Override
    public void edit(MyApartment myApartment) {
       utilitiesDao1.edit(myApartment);
    }

    @Override
    public MyApartment getById(Long id) {
        return utilitiesDao1.getById(id);
    }
}
