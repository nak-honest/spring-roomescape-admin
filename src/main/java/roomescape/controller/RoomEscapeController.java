package roomescape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomEscapeController {

    @GetMapping("/admin")
    public String admin() {
        return "/admin/index";
    }

    @GetMapping("/admin/reservation")
    public String reservation() {
        return "/admin/reservation-legacy";
    }

    @GetMapping("/admin/time")
    public String time() {
        return "/admin/time";
    }
}
