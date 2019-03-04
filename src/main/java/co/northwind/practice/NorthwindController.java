package co.northwind.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NorthwindController {

	@Autowired
	private NorthwindDao northwindDao;

	@RequestMapping("/")
	public ModelAndView index() {

		List<Supplier> listOfWinds = northwindDao.findAll();
		ModelAndView mav = new ModelAndView("index", "winds", listOfWinds);
		System.out.println(listOfWinds);
		return mav;

	}

}
