package com.epam.jc.task7;

import java.lang.annotation.*;

/**
 * @author Vladislav Boboshko
 * Simple annotation that shows an author
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {
    /**
     * Get author of class.
     * @return author of the annotated class.
     */
    String author() default "Me";
}
