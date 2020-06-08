package com.hcl.Template.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MSTemplateService")
public class ServiceController {

	@RequestMapping("/propertyCheck")
	public String readPropertyFile() {
		return "a bootiful  MSTemplateServiceController  Service Running for propertyCheck";

	}
}
