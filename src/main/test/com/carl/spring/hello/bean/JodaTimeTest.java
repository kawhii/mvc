package com.carl.spring.hello.bean;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

/**
 * @author Carl
 * @date 2016/9/2
 */
public class JodaTimeTest {
    @Test
    public void dateTimeTest() {
        //2016/9/2
        //当前时间
        java.util.Date juDate = new Date();
        //如果无参，也默认是当前时间的
        DateTime dt = new DateTime(juDate);

        show(dt);
    }

    @Test
    public void dateTimeChange() {
        DateTime dt = new DateTime();
        //把年改为2000年的
        DateTime year2000 = dt.withYear(2000);
        //时间加两个小时
        DateTime twoHoursLater = dt.plusHours(2);
        show(dt);//2016-9-2 0:16
        show(year2000);//2000-9-2 0:16
        show(twoHoursLater);//2016-9-2 2:16
    }

    @Test
    public void dateTimeText() {
        DateTime dt = new DateTime();
        String monthName = dt.monthOfYear().getAsText();
        //根据地区获取Text
        String frenchShortName = dt.monthOfYear().getAsShortText(Locale.CHINA);
        boolean isLeapYear = dt.year().isLeap();
        DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        System.out.println(monthName);
        System.out.println(frenchShortName);
        System.out.println(isLeapYear);
        //月份的最后一天
        System.out.println(dt.dayOfMonth().getMaximumValue());
        show(rounded);
    }

    @Test
    public void dateTimeArgs() {
        //实例就能够确定年月日时分秒
        DateTime dt = new DateTime(2005, 3, 26, 12, 0, 0, 0);
        //这里能够进行时间的计算，plus就是加了，周期肯定是那个接口的，里面肯定也有年月日时分秒
        DateTime plusPeriod = dt.plus(Period.days(1));
        DateTime plusDuration = dt.plus(new Duration(24L*60L*60L*1000L));
        show(dt);//2005-3-26 12:0
        //减一天
        show(dt.plusDays(-1));//2005-3-25 12:0
        show(plusPeriod);//2005-3-27 12:0
        show(plusDuration);//2005-3-27 12:0
    }

    @Test
    public void dataTimeFormat() {
        DateTimeFormatter fmt = new DateTimeFormatterBuilder()
                .appendDayOfMonth(1)
                .appendLiteral('-')
                .appendMonthOfYearShortText()
                .appendLiteral('-')
                .appendTwoDigitYear(1956)  // pivot = 1956
                .toFormatter();
        DateTime dt = new DateTime();
        System.out.println(dt.toString(fmt));//2-九月-16
    }

    private void show(DateTime dateTime) {
        Map<String, @MyAnnotation("") String> m = new HashMap<>();
        List<@MyAnnotation("") String> a = new ArrayList<>();
        System.out.println(dateTime.getYear() + "-" + dateTime.getMonthOfYear() + "-" + dateTime.getDayOfMonth() + " " + dateTime.getHourOfDay() + ":" + dateTime.getMinuteOfHour());
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD,ElementType.TYPE, ElementType.TYPE_USE})
    public @interface MyAnnotation {
        // 注解属性(注解属性也可以是数组，枚举，注解等)
        String value();
    }
}
