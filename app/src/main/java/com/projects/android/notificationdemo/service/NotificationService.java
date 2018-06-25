package com.projects.android.notificationdemo.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class NotificationService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e("FIREBASE NOTIFICATION", "El contenido es -> " + remoteMessage.getNotification().getBody());
        super.onMessageReceived(remoteMessage);
    }
}
