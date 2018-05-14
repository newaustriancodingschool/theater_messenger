package at.refugeescode.theater_messenger.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/sp")
public class SelectProblemController {


    @GetMapping
    String page() {
        return "selectproblem";
    }

    // @model add problems


    @GetMapping(params = {"problem","actor","projectId"})
    String page1(@RequestParam("projectId") String s,@RequestParam("problem") String p,@RequestParam("actor") String u, Model model) {
        System.out.println("problem = " + p);
        System.out.println("actor = " + u);
        System.out.println("projectId = " + s);

        // save in info DB

        model.addAttribute("projectId",s);
        model.addAttribute("actors",s);
        model.addAttribute("success",true);
        return "selectproblem";
    }

    @GetMapping(params = {"id"})
    String page2(@RequestParam("id") String d, Model model) {
        System.out.println("d = " + d);
        // model add for actors


        model.addAttribute("b",d);
        return "selectproblem";
    }



}
