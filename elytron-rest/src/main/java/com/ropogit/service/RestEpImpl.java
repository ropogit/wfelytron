package com.ropogit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class RestEpImpl implements RestEp {

    public static final Logger LOG = LoggerFactory.getLogger(RestEpImpl.class);

    @Override
    public Response print() {
        LOG.info("### ping");
        return Response.ok("Finished").build();
    }

}
