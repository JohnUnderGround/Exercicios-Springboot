package john.underground.exemploconstructpredestroy.model;

import lombok.*;

//Lombok - todas as suas anotations
@ToString
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Client {

    private String name;
    private String lastName;


}
