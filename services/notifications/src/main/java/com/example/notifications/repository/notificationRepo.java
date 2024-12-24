package com.example.notifications.repository;

import com.example.notifications.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface notificationRepo extends MongoRepository<Notification, String> {
}
