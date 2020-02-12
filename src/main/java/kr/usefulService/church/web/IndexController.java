package kr.usefulService.church.web;

import kr.usefulService.church.service.quantity.QuantityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final QuantityService quantityService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/bible/check")
    public String bibleCheck(Model model){
        model.addAttribute("quantity", quantityService.findThisMonthASC());
        return "bible-check";
    }

}
