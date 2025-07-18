
package com.ogbrown.aurorademo.repository;

import com.ogbrown.aurorademo.model.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, UUID> {
    // Additional query methods (if needed) can be defined here
}