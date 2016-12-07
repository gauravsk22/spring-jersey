/*
package org.practice.springjersey.interaction;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.practice.springjersey.domain.onetomany.MerchantAcquirer;
import org.practice.springjersey.domain.onetomany.MerchantAcquirerUpdateStatus;
import org.practice.springjersey.domain.onetomany.MerchantAcquirers;
import org.practice.springjersey.domain.onetomany.PendingMerchantAcquirerUpdate;
import org.practice.springjersey.repository.PendingMerchantAcquirerUpdateRepository;
import org.practice.springjersey.service.MerchantAcquirerService;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Api(value="hello", description="Say Hello service")
@Path("/hello")
public class HelloService {

	@GET
	@Path("/{name}")
	@Produces("text/plain")
	@ApiOperation(
			value="Say Hello to user",
			notes="Say Hello to user"
	)
	@ApiResponses({
		    @ApiResponse(code = 200, message = "Successfully able to greet the user."),
		    @ApiResponse(code = 500, message = "Internal Server Error")
	})
	public String sayHello(@ApiParam(value="name of the user", name="name", required=true) @PathParam("name") String name){

		MerchantAcquirer merchantAcquirer = new MerchantAcquirer();
		merchantAcquirer.setReadonly(false);
		merchantAcquirer.setUnknownAcqFlag(false);
		merchantAcquirer.setAcquirerId(324234l);
		merchantAcquirer.setMerchantAcqCode("mac1");
		merchantAcquirer.setOrgId("111");
		merchantAcquirer.setPassword("pwd");

		PendingMerchantAcquirerUpdate pendingMerchantAcquirerUpdate = new PendingMerchantAcquirerUpdate();
		pendingMerchantAcquirerUpdate.setUpdateStatus(MerchantAcquirerUpdateStatus.UPDATE_PENDING);
		List<PendingMerchantAcquirerUpdate> pendingMerchantAcquirerUpdateList = new ArrayList<PendingMerchantAcquirerUpdate>();
		pendingMerchantAcquirerUpdateList.add(pendingMerchantAcquirerUpdate);
		merchantAcquirer.setPendingMerchantAcquirerUpdates(pendingMerchantAcquirerUpdateList);

		pendingMerchantAcquirerUpdate.setMerchantAcquirer(merchantAcquirer);

//		merchantAcquirerService.saveMerchantAcquirer(merchantAcquirer);

//		pendingMerchantAcquirerUpdateRepository.save(pendingMerchantAcquirerUpdate);

		return "Hello "+name+"...How are you today!";
	}
	
	*/
/*@ApiImplicitParam(name="name", value = "username", required=true)
	public String sayHello(@BeanParam Old_User user){
		return "Hello "+user.getName()+"...How are you today!";
	}*//*



	@GET
	@Path("/acquirers")
	@Produces(MediaType.APPLICATION_JSON)
	public MerchantAcquirers getMerchantAcquirers(){


		*/
/*MerchantAcquirer merchantAcquirer2 = new MerchantAcquirer();
		merchantAcquirer2.setReadonly(false);
		merchantAcquirer2.setUnknownAcqFlag(false);
		merchantAcquirer2.setAcquirerId(324234l);
		merchantAcquirer2.setMerchantAcqCode("mac2");
		merchantAcquirer2.setOrgId("222");
		merchantAcquirer2.setPassword("pwd22");

		PendingMerchantAcquirerUpdate pendingMerchantAcquirerUpdate2 = new PendingMerchantAcquirerUpdate();
		pendingMerchantAcquirerUpdate2.setUpdateStatus(MerchantAcquirerUpdateStatus.UPDATE_SUCCESS);
		List<PendingMerchantAcquirerUpdate> pendingMerchantAcquirerUpdateList2 = new ArrayList<PendingMerchantAcquirerUpdate>();
		pendingMerchantAcquirerUpdateList2.add(pendingMerchantAcquirerUpdate2);
		merchantAcquirer2.setPendingMerchantAcquirerUpdates(pendingMerchantAcquirerUpdateList2);

		pendingMerchantAcquirerUpdate2.setMerchantAcquirer(merchantAcquirer2);

		pendingMerchantAcquirerUpdateRepository.save(pendingMerchantAcquirerUpdate2);*//*




		MerchantAcquirers merchantAcquirers = merchantAcquirerService.getAllAcquirers();

		return merchantAcquirers;

	}

	@DELETE
	@Path("/acquirers/{id}")
	public void deleteMerchantAcquirer(@PathParam("id") Long id){

		merchantAcquirerService.deleteMerchantAcquirer(id);

	}

}
*/
