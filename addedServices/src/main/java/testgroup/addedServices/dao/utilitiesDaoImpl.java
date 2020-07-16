package testgroup.addedServices.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testgroup.entity.MyApartment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class utilitiesDaoImpl implements utilitiesDao {

//    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    private final String DATABASE_URL = "JDBC:mysql://localhost/abonenty";
//    private final String USER_NAME = "root";
//    private final String PASSWORD = "35403540";

    private static final AtomicInteger autoId = new AtomicInteger(0);
    private static Map<Long, MyApartment> myApartmentMap = new HashMap<>();

//    static {
//        MyApartment myApartment1 = new MyApartment();
//        myApartment1.setId((long) autoId.getAndIncrement());
//        myApartment1.setApartNum(1);
//        myApartment1.setApartSquare(70.2);
//        myApartment1.setDebt(0.00);
//        myApartment1.setPaySumm(468.20);
//        myApartment1.setApartEmail("realtest@gmail.com");
//        myApartment1.setquantityPeople(3);
//    }

private SessionFactory sessionFactory;
@Autowired
public void setSessionFactory (SessionFactory sessionFactory){
    this.sessionFactory = sessionFactory;
}
@SuppressWarnings("unchecked")
public  List <MyApartment> allMyAppartments(){
    Session session = sessionFactory.getCurrentSession();
    return  session.createQuery("from MyApartment").list();
}


    @Override
    public List<MyApartment> allApartments() {

        return new ArrayList<>(myApartmentMap.values());
    }

    @Override
    public MyApartment getOne(Long id) {
//        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD)){
//            Class.forName(JDBC_DRIVER);
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM apartment where apartment.appartment_id = ?");
//            statement.setInt(1, id.intValue());
//            ResultSet resultSet = statement.executeQuery();
//            MyApartment myApartment = new MyApartment();
//            myApartment.setId(new Long(resultSet.getInt("id")) );
//
//
//
//        }catch (SQLException e){} catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public void add(MyApartment myApartment) {
       myApartment.setId((long) autoId.getAndIncrement());
       myApartmentMap.put(myApartment.getId(), myApartment);
    }

    @Override
    public void delete(MyApartment myApartment) {
      myApartmentMap.remove(myApartment.getId());
    }

    @Override
    public void edit(MyApartment myApartment) {
       myApartmentMap.put(myApartment.getId(), myApartment);
    }

    @Override
    public MyApartment getById(Long id) {

        return myApartmentMap.get(id);
    }
}
