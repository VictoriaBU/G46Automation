package Old;

import Old.AClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CClass {


    private static final Logger LOG = LogManager.getLogger("Класс Б");
    protected String name;

    public CClass(String name) {
        this.name = name;
    }

    public CClass() {

    }

    public void name1(List<String> list) {

        AClass aClass = new AClass();
        aClass.getColors();
        try {
        List<String> newColors = aClass.getColors();
        for (int i = 0; i < newColors.size(); i++) {
            String temp = newColors.get(i);
            LOG.info("=========");

            String[] parts = temp.split("");
            for (String x : parts) {
                LOG.debug(x);

            }
          }
        }
        catch (NullPointerException e){
            LOG.error( "Массив не  определён. Пожалуйста проверьте корректность вводимых значений");
        }
        catch (Exception e){
            LOG.error("Произошла неизвестная ошибка. Подробнее:" + e);
         }
    }
}