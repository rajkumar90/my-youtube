package com.youtube.resource;

import static com.youtube.util.YoutubeConstantsConstants.APPLICATION_JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.youtube.service.model.Subscription;

import io.swagger.annotations.Api;

/**
 * This is the resource class for the CRUD APIs for jog info details
 * @author raj
 *
 */
@Path("/subscribe")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Api(value = "/subscribe")
public interface SubscriptionResource {
	
	/**
	 * API for subscription (POST)
	 * @param subscription
	 * @return
	 * @throws Exception
	 */
	@POST
	@Path("/")
	@Produces(APPLICATION_JSON)
	@Consumes(APPLICATION_JSON)
	public Subscription subscribe(Subscription subscription) throws Exception;
		
	/**
	 * API for unsubscribe (DELETE)
	 * @param subscription
	 * @throws Exception
	 */
	@DELETE
	@Path("/")
	@Consumes(APPLICATION_JSON)
	public void unsubscribe(Subscription subscription) throws Exception;
		
}
