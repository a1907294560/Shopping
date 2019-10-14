package com.neuedu.controller;

import com.neuedu.pojo.Carousel;
import com.neuedu.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;
    @RequestMapping("list.action")
    public String getShowCarousel( Carousel carousel, Model model ) throws Exception {
        model.addAttribute ("list",carouselService.getShowCarousel (carousel));
        return "carousel/tist";
    }
}
