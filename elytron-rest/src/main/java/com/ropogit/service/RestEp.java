package com.ropogit.service;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("rst")
@DeclareRoles({"ropogit"})
@RolesAllowed({"ropogit"})
public interface RestEp {

    @GET
    @Path("test")
    public Response print();
}
