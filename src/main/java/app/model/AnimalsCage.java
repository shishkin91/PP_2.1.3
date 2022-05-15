package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    private Timer timer = new Timer(); // 4) На основе класса Timer создайте бин. Свяжите с AnimalCage.

    public Timer getTimer() {
        return timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime()); // или как было через new, тест проходит в любом случае. не понятно условие про одинаковое время.
        System.out.println("________________________");
    }
}
