package cn.xiaoyanol.sticker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
}
