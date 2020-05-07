package com.jack;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Test {
    public static void main(String[] args) {
        String a = null;
        String b = "";
        Long d = 12324567897L;
//        Long.valueOf(a);
//        Long.valueOf(b);
        System.out.println();
        String v = StringUtils.isEmpty(a)?LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli()+"":a;
        Long aLong = Long.valueOf(v);
        System.out.println(aLong);

    }
}
