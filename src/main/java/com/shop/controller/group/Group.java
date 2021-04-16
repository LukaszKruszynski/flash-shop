package com.shop.controller.group;

import com.shop.service.group.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("groups")
@RequiredArgsConstructor
public class Group {
    private final GroupService service;
}
