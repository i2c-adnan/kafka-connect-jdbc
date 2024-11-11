package io.confluent.connect.jdbc.sink.metadata;

import io.confluent.connect.jdbc.sink.JdbcSinkConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTypeConverter {
    private final Logger log = LoggerFactory.getLogger(DateTypeConverter.class);

    private final JdbcSinkConfig config;

    // date
    private final SimpleDateFormat dateFromFormat;
    private final SimpleDateFormat dateToFormat;

    // time
    private final SimpleDateFormat timeFromFormat;
    private final SimpleDateFormat timeToFormat;

    // timestamp

    private final SimpleDateFormat timestampFromFormat;
    private final SimpleDateFormat timestampToFormat;





    public DateTypeConverter(JdbcSinkConfig config) {
        this.config = config;

        // date format
        if(config.dateFromFormat != null && config.dateToFormat != null) {
            log.info("Date format conversion enabled");
            dateFromFormat = new SimpleDateFormat(config.dateFromFormat);
            if (this.config.dateFromTimezone != null) dateFromFormat.setTimeZone(this.config.dateFromTimezone);
            dateToFormat = new SimpleDateFormat(config.dateToFormat);
            if (this.config.dateToTimezone != null) dateToFormat.setTimeZone(this.config.dateToTimezone);
        } else {
            dateFromFormat = null;
            dateToFormat = null;
        }
        // time format

        if(config.timeFromFormat != null && config.timeToFormat != null) {
            log.info("Time format conversion enabled");
            timeFromFormat = new SimpleDateFormat(config.timeFromFormat);
            if (this.config.dateFromTimezone != null) timeFromFormat.setTimeZone(this.config.dateFromTimezone);
            timeToFormat = new SimpleDateFormat(config.timeToFormat);
            if (this.config.dateToTimezone != null) timeToFormat.setTimeZone(this.config.dateToTimezone);
        } else {
            timeFromFormat = null;
            timeToFormat = null;
        }


        // timestamp format
        if (config.timestampFromFormat == null || config.timestampToFormat == null) {
            log.info("Timestamp format conversion disabled");
            timestampFromFormat = null;
            timestampToFormat = null;
            return;
        }

        timestampFromFormat = new SimpleDateFormat(config.timestampFromFormat);
        if (this.config.dateFromTimezone != null) timestampFromFormat.setTimeZone(this.config.dateFromTimezone);
        timestampToFormat = new SimpleDateFormat(config.timestampToFormat);
        if (this.config.dateToTimezone != null) timestampToFormat.setTimeZone(this.config.dateToTimezone);

    }

    public String convertDate(String dateValue) throws ParseException {
        log.info("Converting date...");

            if (dateFromFormat == null) {
                return dateValue;
            }
            Date parsedDate = dateFromFormat.parse(dateValue);
            return dateToFormat.format(parsedDate);

    }

    public String convertTime(String dateValue) throws ParseException {
        log.info("Converting time...");

            if (timeFromFormat == null) {
                return dateValue;
            }
            Date parsedDate = timeFromFormat.parse(dateValue);
            return timeToFormat.format(parsedDate);

    }

    public String convertTimeStamp(String dateValue) throws ParseException {
        log.info("Converting timestamp...");
        if (timeFromFormat == null) {
            return dateValue;
        }
        Date parsedDate = timeFromFormat.parse(dateValue);
        return timestampToFormat.format(parsedDate);
    }

//    private synchronized String convertDateFormat(String originalDateString, String originalFormat, String targetFormat, java.util.TimeZone fromTimeZone, java.util.TimeZone toTimeZone) {
//        if (config.printDebugLogs) {
//            log.info("Converting: originalDateString: {} originalFormat: {} targetFormat: {}", originalDateString, originalFormat, targetFormat);
//        }
//        if (originalDateString == null || originalFormat == null || targetFormat == null || originalDateString.isEmpty() || originalFormat.isEmpty() || targetFormat.isEmpty() || "null".equalsIgnoreCase(originalDateString)) {
//            return originalDateString;
//        }
//
//        SimpleDateFormat originalFormatter = new SimpleDateFormat(originalFormat);
//        if (fromTimeZone != null) originalFormatter.setTimeZone(fromTimeZone);
//
//        SimpleDateFormat targetFormatter = new SimpleDateFormat(targetFormat);
//        if (toTimeZone != null) targetFormatter.setTimeZone(toTimeZone);
//
//        try {
//            Date parsedDate = originalFormatter.parse(originalDateString);
//            return targetFormatter.format(parsedDate);
//        } catch (Exception e) {
//            log.error("Date conversion failed", e);
//            return originalDateString;
//        }
//    }
}
