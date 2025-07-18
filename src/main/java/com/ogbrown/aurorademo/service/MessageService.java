package com.ogbrown.aurorademo.service;

import com.ogbrown.aurorademo.model.MessageEntity;
import com.ogbrown.aurorademo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageEntity saveMessage(String content, String sender) {
        MessageEntity message = MessageEntity.builder()
                .id(UUID.randomUUID())
                .content(content)
                .sender(sender)
                .timestamp(Instant.now())
                .build();
        return messageRepository.save(message);
    }
}
