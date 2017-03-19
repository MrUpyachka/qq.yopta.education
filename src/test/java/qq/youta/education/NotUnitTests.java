package qq.youta.education;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * For testing of .<br>
 * Created on 19.03.17.
 * @author upyachka.
 */
public class NotUnitTests {

    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("JOPA", "SISKE");
        names.add("Gavno");
        names.add("Der\'mo");
        names.add("Nasrat\'");
        List<String> digits = Lists.newArrayList("123123", "132123", "3443443");
        System.out.println(names);
    }
}
