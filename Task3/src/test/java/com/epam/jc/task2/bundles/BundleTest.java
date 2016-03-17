package com.epam.jc.task2.bundles;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

/**
 * Created by endiny on 17.03.16.
 */
public class BundleTest {

    @Test
    public void testEnglish() throws Exception {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.epam.jc.task2.bundles.Bundle", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("Question1"));
        System.out.println(resourceBundle.getString("Question2"));
        System.out.println(resourceBundle.getString("Answer1"));
        System.out.println(resourceBundle.getString("Answer2"));
        assertTrue(resourceBundle.getString("Answer1").equals("Fourty two"));
        assertTrue(resourceBundle.getString("Answer2").equals("Your adverts could be here"));
    }

    @Test
    public void testRussian() throws Exception {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.epam.jc.task2.bundles.Bundle", new Locale("ru", "RU"));
        System.out.println(resourceBundle.getString("Question1"));
        System.out.println(resourceBundle.getString("Question2"));
        System.out.println(resourceBundle.getString("Answer1"));
        System.out.println(resourceBundle.getString("Answer2"));
        assertTrue(resourceBundle.getString("Answer1").equals("Сорок два"));
        assertTrue(resourceBundle.getString("Answer2").equals("Здесь могла бы быть ваша реклама"));
    }
}