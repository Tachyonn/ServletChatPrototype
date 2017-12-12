package com.tachyon.Test.TestImplementations;

import com.tachyon.Abstracts.AbstractMessage;

public class Message extends AbstractMessage {
    public Message() {
        super();
    }

    public Message(String from, String to, String text) {
        super(from, to, text);
    }
}
