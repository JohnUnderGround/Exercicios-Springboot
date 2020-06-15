package john.underground.exemploinjecaodedependencia.model;

import john.underground.exemploinjecaodedependencia.interfaces.AnimalInterface;

public class Cat implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("miau");
    }
}
