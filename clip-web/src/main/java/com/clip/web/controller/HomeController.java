package com.clip.web.controller;

import com.clip.web.dao.ClipRoomDao;
import com.clip.web.dao.HintDao;
import com.clip.web.entity.ClipRoom;
import com.clip.web.entity.EnterForm;
import com.clip.web.entity.Hint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        modelMap.addAttribute("hints", HintDao.getHintList());
        return "home";
    }

    @RequestMapping("/enter")
    public String enterRoom(@ModelAttribute("form") EnterForm form, ModelMap modelMap) {
        if (CollectionUtils.isEmpty(form.getHintIdList())){
            return "/";
        }

        List<String> hintIdList = form.getHintIdList();
        ClipRoom room = ClipRoomDao.getByHintIds(hintIdList);

        modelMap.addAttribute("room", room);
        return "room";
    }

    @RequestMapping("/update")
    public String update(@ModelAttribute("form11") EnterForm form, ModelMap modelMap) {

        if (CollectionUtils.isEmpty(form.getHintIdList())){
            return "/login";
        }

        System.out.println("aaaaa");

//        modelMap.addAttribute("content", form.getContent());

        System.out.println("bbbbbbb");
        return "room";
    }

}
