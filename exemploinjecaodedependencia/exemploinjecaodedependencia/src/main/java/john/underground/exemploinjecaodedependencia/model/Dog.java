package john.underground.exemploinjecaodedependencia.model;

import john.underground.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author John
 */
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au au!");
    }

}
