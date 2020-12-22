package old;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AClass extends CClass {

    private static final Logger LOG = LogManager.getLogger("Класс А ");

    private String name;
private int number;

    public AClass() {
        super();

        LOG.info("Новый пустой экземпляр класса " + getClass());
        LOG.info("=========");
    }
    public AClass(String name, int number) {
        super();
        this.name = name;
        this.number = number;
    }

    public String colors[] = new String[]{"white", "black", "red", "green", "blue", "yellow"};


    public List<String> getColors() {

        List<String> newColors = new ArrayList<String>();
        int index = 0;
        while (index < 4 && index < colors.length) {
            newColors.add(colors[index]);
            index++;
        }
        return newColors;

         }


}










