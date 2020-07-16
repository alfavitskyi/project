package testgroup.addedServices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.addedServices.service.UtilitiesService;
import testgroup.addedServices.service.utilitiesServiceImpl;
import testgroup.entity.MyApartment;

import java.util.List;

@Controller
public class utilitiesController {
   // private utilitiesController utilitiesContr = new utilitiesController();
    private UtilitiesService utilitiesService1 = new utilitiesServiceImpl();
    //private UtilitiesService utilitiesService;

//    public void setUtilitiesService(UtilitiesService utilitiesService) {
//        this.utilitiesService = utilitiesService;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allQuantities (){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu");
        return modelAndView;
    }
@RequestMapping(value = "/addQuantities", method = RequestMethod.GET)
    public ModelAndView addCounts (){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addQuantities");
        return  modelAndView;
    }
@RequestMapping (value = "/appartments", method = RequestMethod.GET)
    public ModelAndView allAppartments (){
    List <MyApartment> apartmentList = utilitiesService1.allApartments();

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("appartments");
    modelAndView.addObject("appartments", apartmentList);
    return  modelAndView;
}
   @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage (@PathVariable("id")Long id){
    MyApartment myApartment =utilitiesService1.getById(id);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("editAppartment");
    modelAndView.addObject("myAppartment", myApartment);
    modelAndView.addObject("myAppartment", utilitiesService1.getById(id));
    return modelAndView;
   }
   @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editAppartment (@ModelAttribute("myAppartment")MyApartment myApartment){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("redirect:/");
    utilitiesService1.edit(myApartment);
    return modelAndView;
   }
   @RequestMapping (value = "/add", method = RequestMethod.GET)
   public ModelAndView addPage(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("editPage");
    return modelAndView;
   }
   @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addAppartment (@ModelAttribute("appartment")MyApartment myApartment){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("redirect:/");
    utilitiesService1.add(myApartment);
    return modelAndView;
   }
   @RequestMapping (value = "/delete{id}", method = RequestMethod.GET)
    public ModelAndView deleteAppartment (@PathVariable("id")int id){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("redirect:/");
    MyApartment myApartment = utilitiesService1.getById((long) id);
    utilitiesService1.delete(myApartment);
    return modelAndView;
   }
}
