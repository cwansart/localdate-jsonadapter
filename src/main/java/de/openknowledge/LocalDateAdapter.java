package de.openknowledge;

import javax.json.bind.adapter.JsonbAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateAdapter implements JsonbAdapter<LocalDate, String> {

    @Override
    public String adaptToJson(final LocalDate date) throws Exception {
        return date.format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public LocalDate adaptFromJson(final String date) throws Exception {
        LocalDate parsedDate;

        try {
            parsedDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        } catch (final DateTimeParseException e) {
            // You could throw another exception here for the validation.
            parsedDate = LocalDate.now();
        }

        return parsedDate;
    }
}
