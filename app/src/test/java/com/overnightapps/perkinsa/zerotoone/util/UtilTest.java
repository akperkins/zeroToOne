package com.overnightapps.perkinsa.zerotoone.util;/*
 * Copyright (c) 2016 Nick Mobile as an unpublished work. Neither
 * this material nor any portion thereof may be copied or distributed
 * without the express written consent of Nick Mobile.
 * This material also contains proprietary and confidential information
 * of 2016 Nick Mobile and its suppliers, and may not be used by or
 * disclosed to any person, in whole or in part, without the prior written
 * consent of 2016 Nick Mobile.
 */

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {
    @Test
    public void isEmpty_stringIsNull_returnsTrue() throws Exception {
        String str = null;

        boolean empty = Util.isEmpty(str);
        assertThat(empty).isTrue();
    }

    @Test
    public void isEmpty_stringIsEmpty_returnsTrue() throws Exception {
        String str = "";

        boolean empty = Util.isEmpty(str);
        assertThat(empty).isTrue();
    }

    @Test
    public void isEmpty_stringIsValidValue_returnsFalse() throws Exception {
        String str = "hello";

        boolean empty = Util.isEmpty(str);
        assertThat(empty).isFalse();
    }

    @Test
    public void isNotEmpty_stringIsNull_returnsFalse() throws Exception {
        String str = null;

        boolean empty = Util.isNotEmpty(str);
        assertThat(empty).isFalse();
    }

    @Test
    public void isNotEmpty_stringIsEmpty_returnsFalse() throws Exception {
        String str = "";

        boolean empty = Util.isNotEmpty(str);
        assertThat(empty).isFalse();
    }

    @Test
    public void isNotEmpty_stringIsValidValue_returnsTrue() throws Exception {
        String str = "full";

        boolean empty = Util.isNotEmpty(str);
        assertThat(empty).isTrue();
    }
}