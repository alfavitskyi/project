//package testgroup.addedServices.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import testgroup.entity.MyApartment;
//
////import testgroup.addedServices.model.MyApartment;
//@Controller
//public class TestController {
////    private static MyApartment myApartment;
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    static {
////        myApartment = new MyApartment();
////        myApartment.setId(2226656L);
////        myApartment.setApartNum(21);
////        myApartment.setApartSquare(70.2);
////        myApartment.setDebt(0.00);
////        myApartment.setPaySumm(254.30);
////        myApartment.setApartEmail("testmail@gmail.com");
//
//
//
//    }
//
//        @RequestMapping(value = "/", method = RequestMethod.GET)
//        public String allQuantities(Model modelAndView) {
//            MyApartment myApartment = new MyApartment();
//            myApartment.setId(2226656L);
//            myApartment.setApartNum(21);
//            myApartment.setApartSquare(70.2);
//            myApartment.setDebt(0.00);
//            myApartment.setPaySumm(254.30);
//            myApartment.setApartEmail("testmail@gmail.com");
//
//            modelAndView.addAttribute("myApartment", myApartment);
//            return "menu";
//        }
//    }
//
