package dev.ifrs.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.ifrs.service.ConverterService;

@Path("/converter")
public class ConverterController {

    public ConverterService converterService = new ConverterService();

    @GET
    @Path("/{lib}/kg")
    @Produces(MediaType.TEXT_PLAIN)
    public Double convertLibToKg(@PathParam("lib") Double lib) {
        return converterService.convertLibToKg(lib);
    }

    @GET
    @Path("/{kg}/lib")
    @Produces(MediaType.TEXT_PLAIN)
    public Double convertKgToLib(@PathParam("kg") Double kg) {
        return converterService.convertKgToLib(kg);
    }
}