package com.example.demo.controller;

import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/test")
    public String test(){
        try{
            System.out.println("test 开始执行："+System.currentTimeMillis());
            taskService.doTask();
            Thread.sleep(1000);
            System.out.println("test 执行结束："+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "success";
    }

}
