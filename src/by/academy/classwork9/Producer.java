package by.academy.classwork9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)

public @interface Producer {
   int startYear();
   String country();
   String founderFullName();
}
