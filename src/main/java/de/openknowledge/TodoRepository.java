package de.openknowledge;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class TodoRepository {

    private static final List<Todo> todos = Arrays.asList(
        new Todo(LocalDate.now()),
        new Todo(LocalDate.now().plusDays(1)),
        new Todo(LocalDate.now().minusDays(3))
    );

    public List<Todo> getAll() {
        return new ArrayList<>(todos);
    }
}
