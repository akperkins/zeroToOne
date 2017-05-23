package com.overnightapps.perkinsa.zerotoone;

import java.util.Collection;

class Preconditions {
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
