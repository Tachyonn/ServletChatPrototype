package com.tachyon.Test;

import com.tachyon.Test.TestImplementations.Message;

import java.util.ArrayList;
import java.util.List;

public class TestMessage {
    public static void execute() {
        addMessages().forEach(System.out::println);
    }

    private static List<Message> addMessages() {
        List<Message> msgList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            msgList.add(new Message("fromUser" + i, "toUser" + i, "message text"));
        }
        return msgList;
    }
}
