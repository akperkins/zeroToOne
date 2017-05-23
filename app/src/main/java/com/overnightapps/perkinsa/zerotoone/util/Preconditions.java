package com.overnightapps.perkinsa.zerotoone.util;

import java.util.Collection;

public class Preconditions {
    /**
     * Used to assert that an object is not null.
     * */
    public static void checkNotNull(Object object) {
        if(object == null){
            throw new AssertionError();
        }
    }

    /**
     * Used to assert that a {@link Collection} is not empty.
     * */
    public static void checkNotEmpty(Collection collection) {
        Preconditions.checkNotNull(collection);
        if(collection.isEmpty()){
            throw new AssertionError();
        }
    }
}
