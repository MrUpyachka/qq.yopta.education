package qq.yopta.education;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Evil on 19.03.2017.
 */
@RestController
public class Controller {

    /** Internal logger. */
    private static final Logger LOG = LogManager.getLogger(Controller.class);

    @RequestMapping("/")
    public ModelAndView simple(Model model, HttpSession session, @RequestParam String name) {
        LOG.debug("Name is {}", name);
        model.addAttribute("NAME", name);
        session.setAttribute("NAME", model.asMap().get("NAME").toString());
        return new ModelAndView("home", model.asMap());
    }

    @RequestMapping("/bash")
    public ModelAndView bash(){
        return new ModelAndView("redirect:/?name=lulz");
    }
}
