package com.overnightapps.perkinsa.zerotoone;/*
 * Copyright (c) 2016 Nick Mobile as an unpublished work. Neither
 * this material nor any portion thereof may be copied or distributed
 * without the express written consent of Nick Mobile.
 * This material also contains proprietary and confidential information
 * of 2016 Nick Mobile and its suppliers, and may not be used by or
 * disclosed to any person, in whole or in part, without the prior written
 * consent of 2016 Nick Mobile.
 */

import org.junit.Test;

import java.util.Collections;

public class FormTest {

    @Test(expected = AssertionError.class)
    public void constructor_nullListPassed_exceptionThrown() throws Exception {
        // WHEN
        Form form = new Form(null);
    }

    @Test(expected = AssertionError.class)
    public void constructor_listIsEmpty_exceptionThrown() throws Exception {
        // WHEN
        Form form = new Form(Collections.emptyList());
    }
}