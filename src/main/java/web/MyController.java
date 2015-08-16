package web;

import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("data", "World!");
		return "index";
	}
}
