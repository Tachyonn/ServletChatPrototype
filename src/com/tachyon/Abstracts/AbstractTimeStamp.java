package com.tachyon.Abstracts;

import java.text.SimpleDateFormat;
import java.util.Date;

/* returns new Date as string */
public abstract class AbstractTimeStamp {
    public static String get(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String result = sdf.format(date);
        return result;
    }

    public static String get() {
        return get(new Date());
    }
}
