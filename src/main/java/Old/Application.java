package Old;

import Old.AClass;
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
       //Вызов из экземпляра класса А, null
        a.name1(null);
        //Вызов из экземпляра класса B, лист из экземпляра класса А
        b.sortColors(a.getColors());
        List<String> lastList = new ArrayList<>();
        b.sortColors(lastList);



    }

}
/* hw01b.printList(hw01a.list());

        //Домашнее задание №2
        LOG.info("Вызов из экземпляра класса А, null");
        hw01a.splitList(null);
        LOG.info("Вызов из экземпляра класса B, лист из экземпляра класса А");
        hw01b.splitList(hw01a.list());
        LOG.info("Вызов из экземпляра класса B, new ArrayList<String>()");
        List<String> inputlist=new ArrayList<>();
        hw01b.splitList(inputlist);
        LOG.info("==Конец==");*/

  /* objectA.charMethod(null);
           System.out.println("--------------");
           objectB.charMethod(objectA.firstMethod());
           System.out.println();
           System.out.println("--------------");
           objectB.charMethod(l);*/