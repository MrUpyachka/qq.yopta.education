package qq.yopta.education.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import qq.yopta.education.task1.constants.ModelConst;
import qq.yopta.education.task1.dto.UserDto;

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

    @RequestMapping
    public ModelAndView home(Model model) {
        LOG.debug("Empty user added to model.");
        final UserDto user = new UserDto();
        user.setName("DefaultName");
        model.addAttribute(ModelConst.USER, user);
        return new ModelAndView(HOME_VIEW, model.asMap());
    }

    @RequestMapping(method = RequestMethod.POST)
    private ModelAndView saveCredentials(@ModelAttribute UserDto user, Model model) {
        LOG.debug("Attempt to save user credentials: {} {}", user.getName(), user.getPassword());
        model.addAttribute(ModelConst.USER, user);
        return new ModelAndView(HOME_VIEW, model.asMap());
    }

}
