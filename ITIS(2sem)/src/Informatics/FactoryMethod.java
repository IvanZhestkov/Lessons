package Informatics;

import java.util.Date;

/**
 * Created by User on 25.02.2017.
 */

//  Этот паттерн - порождающий шаблон проектирования, определяет стандартный метод создания объекта
// , не связанный с вызовом конструктора, оставляя решение о том, какой именно объект создавать, за подклассами

public class FactoryMethod {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digitald");
        Watch watch = maker.creatWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String name) {
        if (name.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (name.equals("Rome")) {
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + name);
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("XX");
    }
}

interface WatchMaker {
    Watch creatWatch();
}

class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch creatWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch creatWatch() {
        return new RomeWatch();
    }
}

