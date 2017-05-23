package com.overnightapps.perkinsa.zerotoone.util;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class AndroidUtil {
    /**
     * Returns the {@code file} in it's {@link String} representation.
     * */
    public static String loadStringFromFile(Context context, String file) throws IOException {
        String json;
        InputStream inputStream = context.getAssets().open(file);
        int size = inputStream.available();
        byte[] buffer = new byte[size];
        //noinspection ResultOfMethodCallIgnored
        inputStream.read(buffer);
        inputStream.close();
        json = new String(buffer, "UTF-8");
        return json;
    }
}
