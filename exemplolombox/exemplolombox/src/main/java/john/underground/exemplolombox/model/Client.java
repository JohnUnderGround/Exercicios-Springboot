package john.underground.exemplolombox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author John
 */

@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter
    @Setter
    private int age;

    /**
     * @return age
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }




}
