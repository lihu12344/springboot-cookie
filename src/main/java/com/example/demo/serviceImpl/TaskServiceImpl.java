package com.example.demo.serviceImpl;

import com.example.demo.service.TaskService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    @Async
    public void doTask() {
        try{
            System.out.println("异步方法开始执行："+System.currentTimeMillis());
            Thread.sleep(10000);
            System.out.println("异步方法执行结束："+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
