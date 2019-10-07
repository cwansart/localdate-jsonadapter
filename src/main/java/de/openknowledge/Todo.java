package de.openknowledge;

import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Todo {

    @NotNull
    @JsonbTypeAdapter(LocalDateAdapter.class)
    private LocalDate dueDate;

    public Todo() {
    }

    public Todo(final LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
