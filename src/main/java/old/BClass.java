package old;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class BClass extends CClass {


    private static final Logger LOG = LogManager.getLogger("Класс В ");
    String name;
    int number;

    public  BClass () {
        LOG.info("Новый пустой экземпляр класса " + getClass());
        LOG.info("=========");

    }
    public BClass (String name, int number) {
        this.name = name;
        this.number = number;

    }
//создаем метод для сортировки данных:
    public void sortColors(List<String> list) {
//сортируем список:
        Collections.sort(list);
//создаем цикл и выводим список:
        for (int i = 0; i < list.size(); i++) {
            LOG.debug(list.get(i));
        }
    }
}
