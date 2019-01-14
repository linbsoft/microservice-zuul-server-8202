package com.linbsoft.microservicezuulserver8202;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	  @RequestMapping("/")
	    public String indexmain() {
	        return "me is  MicroserviceZuulServer8202 on centos7.linbsoft.com:8202";
	    }
	  @RequestMapping("/hello")
	    public String hellomain() {
	        return "me is  MicroserviceZuulServer8202/hello on centos7.linbsoft.com:8202";
	    }
}
