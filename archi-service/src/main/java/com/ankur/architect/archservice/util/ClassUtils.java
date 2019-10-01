package com.ankur.architect.archservice.util;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassUtils<T> {
    protected ClassUtils() {
    }

    public void setIfNotNull(final Supplier getter, final Consumer setter) {

        T t = (T) getter.get();

        if (null != t) {
            setter.accept(t);
        }
    }
}