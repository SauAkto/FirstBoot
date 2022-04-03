package ru.streetcover.lightVer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.streetcover.lightVer.payment.Payment;
import ru.streetcover.lightVer.repo.PostRepository;

@Controller
public class PaymentController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/payment")
    public String payment(Model model) {
        model.addAttribute("title", "Расчет проба пера");
        return "payment";
    }

    @PostMapping("/payment")
    public String paymentRes(@RequestParam String part1, @RequestParam String part2, Model model){
        Payment payment = new Payment();
        double result = payment.payments(part1, part2);
        double result2 = payment.payments2(part1, part2);
        model.addAttribute("result", result);
        model.addAttribute("result2", result2);
        String const1 = "20";
        String const2 = "30";
        model.addAttribute("const1", const1);
        model.addAttribute("const2", const2);

        return "payment";
    }
}
