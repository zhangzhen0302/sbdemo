package sculab.net.sbdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //
    @RequestMapping("/hello")
    public String hellohello(){
        System.out.println("您好，sprin boot的控制器已经被访问到");
        return "show"; //代表一个视图，show.html
    }
}
