package com.epam.jc.task2.bundles;

import java.util.ListResourceBundle;

/**
 * Created by endiny on 17.03.16.
 */
public class Bundle_ru_RU extends ListResourceBundle {

    private Object[][] contents = {
            {"Question1", "В чём смысл жизни?"},
            {"Question2", "Не лает, не кусает, в дом не пускает?"},
            {"Answer1", "Сорок два"},
            {"Answer2", "Здесь могла бы быть ваша реклама"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
