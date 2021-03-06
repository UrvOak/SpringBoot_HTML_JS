package evolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller// By using @Controller alone, @ResponseBody doesn't convert the dto into json. In order to do that, you need @RestController without @ResponseBody.
public class AnyController {
	@GetMapping("/html")// You don't have to reboot the server if you merely make changes to the html or js files.
	public String html(@RequestParam("resource") String resource) {
		return resource + ".html";// Get access to the resources under static folder under resources.
	}
}
