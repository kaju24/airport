package com.example.airport.service;

import org.apache.commons.lang3.StringUtils;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * 
 * Date utilities.
 *
 */
public final class DateFormatUtils {

	private static final char[] DATE_SEPARATORS = new char[] { '-', '/' };
	private static final char DATETIME_SEPARATOR = ' ';

	private static final char TIME_SEPARATOR = ':';

	private static final Locale LOCALE_DUTCH = Locale.forLanguageTag("NL");

	private static final ZoneId ZONEID_DUTCH = ZoneId.of("Europe/Amsterdam");

	private static final java.time.format.DateTimeFormatter DEFAULT_DATETIME_FORMATTER = java.time.format.DateTimeFormatter
			.ofPattern("dd/MM/yyyy HH:mm:ss").withLocale(LOCALE_DUTCH);

	private static final java.time.format.DateTimeFormatter DEFAULT_DATE_FORMATTER = java.time.format.DateTimeFormatter
			.ofPattern("dd/MM/yyyy").withLocale(LOCALE_DUTCH);

	private static final List<java.time.format.DateTimeFormatter> DATE_FORMATTERS = Arrays.asList(
			DEFAULT_DATE_FORMATTER, java.time.format.DateTimeFormatter.ofPattern("d/M/yyyy").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("d-M-yyyy").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/M/d").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-M-d").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(LOCALE_DUTCH));

	private static final List<java.time.format.DateTimeFormatter> DATETIME_FORMATTERS = Arrays.asList(
			DEFAULT_DATETIME_FORMATTER,
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy H:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy H").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy H:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy H:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy H:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy H").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd H:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd H").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:ss").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H").withLocale(LOCALE_DUTCH),
			java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH").withLocale(LOCALE_DUTCH));

	private DateFormatUtils() {
		// Utility class
	}

	/**
	 * Format a local date to the default format.
	 * 
	 * @param localDate the local date
	 * @return the formatted string or null
	 */
	public static String format(final LocalDate localDate) {
		return format(localDate, DEFAULT_DATE_FORMATTER);
	}

	/**
	 * Format a local date to a given format.
	 * 
	 * @param localDate  the local date
	 * @param dateFormat the date format
	 * @return the formatted string or null
	 */
	public static String format(final LocalDate localDate, final String dateFormat) {
		return format(localDate, java.time.format.DateTimeFormatter.ofPattern(dateFormat).withLocale(LOCALE_DUTCH));
	}

	/**
	 * Format a local date to a given format.
	 * 
	 * @param localDate         the local date
	 * @param dateTimeFormatter the date time formatter
	 * @return the formatted string or null
	 */
	public static String format(final LocalDate localDate,
			final java.time.format.DateTimeFormatter dateTimeFormatter) {
		if (localDate == null) {
			return null;
		}

		return localDate.format(dateTimeFormatter);
	}

	/**
	 * Format a local date time to the default format.
	 * 
	 * @param localDateTime the local date time
	 * @return the formatted string or null
	 */
	public static String format(final LocalDateTime localDateTime) {
		return format(localDateTime, DEFAULT_DATETIME_FORMATTER);
	}

	/**
	 * Format a local date time to a given format.
	 * 
	 * @param localDateTime  the local date time
	 * @param dateTimeFormat the date time format
	 * @return the formatted string or null
	 */
	public static String format(final LocalDateTime localDateTime, final String dateTimeFormat) {
		return format(localDateTime,
				java.time.format.DateTimeFormatter.ofPattern(dateTimeFormat).withLocale(LOCALE_DUTCH));
	}

	/**
	 * Format a local date time to a given format.
	 * 
	 * @param localDateTime     the local date time
	 * @param dateTimeFormatter the date time formatter
	 * @return the formatted string or null
	 */
	public static String format(final LocalDateTime localDateTime,
			final java.time.format.DateTimeFormatter dateTimeFormatter) {
		if (localDateTime == null) {
			return null;
		}

		return localDateTime.format(dateTimeFormatter);
	}

	/**
	 * Parse a date time string to a local date time.
	 * 
	 * @param input the string to parse
	 * @return the local date time or null
	 */
	public static LocalDateTime parseDateTime(final String input) {
		if (StringUtils.isBlank(input)) {
			return null;
		}

		final String dateTimeString = adjustDateTimeString(StringUtils.replace(input, "T", " "));

		final LocalDateTime localDateTime = parseDateTime(DATETIME_FORMATTERS, dateTimeString);
		if (localDateTime != null) {
			return localDateTime;
		}

		final LocalDate localDate = parseDate(DATE_FORMATTERS, dateTimeString);
		if (localDate != null) {
			return LocalDateTime.of(localDate, LocalTime.MIDNIGHT);
		}

		return null;
	}



	private static String adjustDateTimeString(final String dateTimeString) {
		final StringBuilder sb = new StringBuilder(StringUtils.length(dateTimeString));
		if (StringUtils.contains(dateTimeString, DATETIME_SEPARATOR)) {
			boolean isFirst = true;
			for (final String part : StringUtils.split(dateTimeString, DATETIME_SEPARATOR)) {
				if (isFirst) {
					sb.append(adjustDateString(part));
				} else {
					sb.append(DATETIME_SEPARATOR);
					sb.append(part);
				}
				isFirst = false;
			}
			return sb.toString();
		}

		return adjustDateString(dateTimeString);
	}

	private static String adjustDateString(final String dateString) {
		for (final char dateSeparator : DATE_SEPARATORS) {
			if (StringUtils.contains(dateString, dateSeparator)) {
				final StringBuilder sb = new StringBuilder(StringUtils.length(dateString));
				boolean isFirst = true;
				for (final String part : StringUtils.split(dateString, dateSeparator)) {
					if (!isFirst) {
						sb.append(dateSeparator);
					}
					if (StringUtils.length(part) == 1) {
						sb.append('0');
					}
					sb.append(part);

					isFirst = false;
				}
				return sb.toString();
			}
		}

		return dateString;
	}

	/**
	 * Parse a date string to a local date.
	 * 
	 * @param dateString the string to parse
	 * @return the local date or null
	 */
	public static LocalDate parseDate(final String dateString) {
		if (StringUtils.isBlank(dateString)) {
			return null;
		}

		return parseDate(DATE_FORMATTERS, dateString);
	}

	private static LocalDateTime parseDateTime(
			final List<java.time.format.DateTimeFormatter> dateTimeFormatters, final String dateTimeString) {
		for (final java.time.format.DateTimeFormatter dateTimeFormatter : dateTimeFormatters) {
			final LocalDateTime date = parseDateTime(dateTimeFormatter, dateTimeString);
			if (date != null) {
				return date;
			}
		}
		return null;
	}

	private static LocalDate parseDate(final List<java.time.format.DateTimeFormatter> dateTimeFormatters,
			final String dateString) {
		for (final java.time.format.DateTimeFormatter dateTimeFormatter : dateTimeFormatters) {
			final LocalDate date = parseDate(dateTimeFormatter, dateString);
			if (date != null) {
				return date;
			}
		}
		return null;
	}

	private static LocalDateTime parseDateTime(final java.time.format.DateTimeFormatter dateTimeFormatter,
			final String dateTimeString) {
		try {
			return LocalDateTime.parse(dateTimeString, dateTimeFormatter);
		} catch (final DateTimeParseException e) {
			return null;
		}
	}

	private static LocalDate parseDate(final java.time.format.DateTimeFormatter dateTimeFormatter,
			final String dateString) {
		try {
			return LocalDate.parse(dateString, dateTimeFormatter);
		} catch (final DateTimeParseException e) {
			return null;
		}
	}

	/**
	 * Get the year of a date.
	 * 
	 * @param date the date
	 * @return the year
	 */

}
