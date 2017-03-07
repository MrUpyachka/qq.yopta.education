package qq.yopta.education.task1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests to root directory.<br>
 * Created on 08.03.17.
 * @author upyachka.
 */
@RestController
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "Helllo, Yopta!";
    }

}
