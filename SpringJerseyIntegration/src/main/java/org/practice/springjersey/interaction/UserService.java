package org.practice.springjersey.interaction;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.practice.springjersey.domain.Old_User;

@Api(value = "UserService", description = "Set of services for Old_User CRUD operations")
@Path("/user")
public class UserService {

	/*@Autowired
	@Qualifier(value = "oldUserRepository")
	Old_UserRepository old_userRepository;

	@Autowired
	@Qualifier(value = "userRepository")
	UserRepository userRepository;*/
	
	@GET
	@Path("/create/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(
			value = "Service to retrieve user",
			notes = "Service returning user for the given user id",
			response = String.class
	)
	@ApiResponses({
		    @ApiResponse(code = 200, message = "Successfully retrieved the user details."),
		    @ApiResponse(code = 404, message = "No user details found for given ID."),
		    @ApiResponse(code = 500, message = "Internal Server Error.")
	})
	public String getUser(@ApiParam(value="Old_User Id", name="id", required=true) @PathParam("name") String name){

		System.out.println("************** log request");

//		Old_User user = new Old_User();
//		user.setName(name);

//		old_userRepository.save(user);

		return "Hello "+name;
	}


/*	@GET
	@Path("/criteria/{orgId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser(@ApiParam(value="Old_User Id", name="id", required=true) @PathParam("orgId") String orgId){

		Specification<User> userSpec = UserSpecifications.findUserByOrgId(orgId);
		List<User> userList = userRepository.findAll(userSpec);

		for(User userItr : userList){
			System.out.println("#####");
			System.out.println(userItr.getUserId());
			System.out.println(userItr.getFirstName());
			System.out.println(userItr.getLastName());
			System.out.println("#####");
			System.out.println();
		}


		return userList;
	}*/
	
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@ApiOperation(
			value = "Service to create new user",
			notes = "New user will be created with the input data provided"
	)
	@ApiResponses({
		    @ApiResponse(code = 200, message = "Old_User created successfully."),
		    @ApiResponse(code = 500, message = "Internal Server Error.")
	})
	public String createUser(@ApiParam(value="Old_User Name", name="name", required=true) @FormParam(value="name") String name,
								@ApiParam(value="Old_User Phone Number", name="phone") @FormParam(value="phone") String phone){
		
		long id = 123;
		
		System.out.println("got request.."+name+"--"+phone);
		
		/*Old_User user = new Old_User();
		user.setId(id);
		user.setName(name);
		user.setPhone(phone);*/
		
//		return Response.status(200).entity(id).build();
		return id+"";
		
	}
	
	
}
