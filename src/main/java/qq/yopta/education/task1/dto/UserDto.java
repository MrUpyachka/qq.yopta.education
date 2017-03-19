package qq.yopta.education.task1.dto;

import java.io.Serializable;

/**
 * Simple user DTO.<br>
 * Created on 19.03.17.
 * @author upyachka.
 */
public class UserDto implements Serializable {

    private String name;

    private String password;

    /** @return value of {@link #name}. */
    public String getName() {
        return name;
    }

    /** @param name value for {@link #name}. */
    public void setName(String name) {
        this.name = name;
    }

    /** @return value of {@link #password}. */
    public String getPassword() {
        return password;
    }

    /** @param password value for {@link #password}. */
    public void setPassword(String password) {
        this.password = password;
    }
}
