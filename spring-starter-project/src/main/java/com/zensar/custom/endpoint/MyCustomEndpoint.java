package com.zensar.custom.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
@Component
@Endpoint(id = "myend")
public class MyCustomEndpoint {
	
	@ReadOperation
	public String myCustomEndpointLogic() {
		return "Custom Endpoint";
	}

}
