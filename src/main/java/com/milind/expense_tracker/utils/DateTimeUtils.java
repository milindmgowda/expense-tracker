package com.milind.expense_tracker.utils;

import com.milind.expense_tracker.contant.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtils {

    public String getCurrentTime() {
        String pattern = Constants.DATE_TIME_FORMAT;
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(Calendar.getInstance().getTime());
    }
}
