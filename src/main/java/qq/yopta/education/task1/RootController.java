package qq.yopta.education.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Handles requests to root directory.<br>
 * Created on 08.03.17.
 * @author upyachka.
 */
@RestController
public class RootController {

    /** Internal logger. */
    private static final Logger LOG = LogManager.getLogger(RootController.class);

    private static final String NAME_PARAM = "NAME";

    private final String HOME_VIEW = "home";

    @RequestMapping("/")
    public ModelAndView withName(@RequestParam String name, Model model, HttpSession session) {
        LOG.debug("show hello page for {}", name);
        session.setAttribute(NAME_PARAM, name);
        return getHomeView("redirect:/" + HOME_VIEW, model, session);
    }

    private ModelAndView getHomeView(String viewName, Model model, HttpSession session) {
        model.addAttribute(NAME_PARAM, session.getAttribute(NAME_PARAM));
        return new ModelAndView(viewName, model.asMap());
    }

    @RequestMapping("/bash")
    public ModelAndView bash() {
        final int number = (int)(Math.random() * 100000);
        LOG.debug("Try redirect to {} quote", number);
        return new ModelAndView(String.format("redirect:http://bash.im/quote/%d", number));
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView(HOME_VIEW);
    }
}
