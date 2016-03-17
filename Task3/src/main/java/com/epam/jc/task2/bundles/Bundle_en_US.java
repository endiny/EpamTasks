package com.epam.jc.task2.bundles;

import java.util.ListResourceBundle;

/**
 * Created by endiny on 17.03.16.
 */
public class Bundle_en_US extends ListResourceBundle {
    private Object[][] contents = {
            {"Question1", "What is the meaning of life?"},
            {"Question2", "No barking, no biting, no access to your house"},
            {"Answer1", "Fourty two"},
            {"Answer2", "Your adverts could be here"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
