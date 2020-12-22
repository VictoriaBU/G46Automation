package old;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final static Logger LOG = LogManager.getLogger("Основной класс");

    public static void main(String[] args) {
        LOG.error("Error");
        LOG.info("Info");
        LOG.debug("Debug");


        AClass a = new AClass();
        BClass b = new BClass();
        b.sortColors(a.getColors());
        LOG.info("==========");
        CClass c = new CClass("Какое-то Имя");
        System.out.println(c.name + ": Выведен текст");

        a.name1(null);

        b.name1(a.getColors());
        List<String> lastList = new ArrayList<>();
        b.name1(lastList);



    }

}
