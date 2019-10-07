package de.openknowledge;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("todos")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @Inject
    private TodoRepository repository;

    @GET
    public Response getAll() {
        return Response.ok(repository.getAll()).build();
    }

    @POST
    public Response createTodo(@Valid final Todo newTodo) {
        return Response.status(Response.Status.CREATED).entity(newTodo).build();
    }
}
