package com.itheima.service.impl.base;

import com.itheima.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@Service
public class MessageServiceImpl implements MessageService {

    private ArrayList<String> msList = new ArrayList<String>();

    @Override
    public void sendMessage(String id) {
        System.out.println("带发送短信的订单已经纳入处理队列 id=" + id);
        msList.add(id);
    }

    @Override
    public String doMessage() {
        String id = msList.remove(0);
        System.out.println("已完成短信发送业务，id=" + id);
        return id;
    }
}
