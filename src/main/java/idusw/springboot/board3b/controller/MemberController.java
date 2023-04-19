package idusw.springboot.board3b.controller;

import idusw.springboot.board3b.service.MemberService;
import idusw.springboot.board3b.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {
    MemberService memberService;
    public MemberController(MemoService memoService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String getLoginform() {
        return "/members/login";
    }
    @PostMapping("/login")
    public String postLogin() {
        return "redirect:/";
    }
    @GetMapping("/register")
    public String getRegisterform() {
        return "/members/register";
    }
    @PostMapping("/register")
    public String postRegister() {
        return "redirect:/";
    }
}
