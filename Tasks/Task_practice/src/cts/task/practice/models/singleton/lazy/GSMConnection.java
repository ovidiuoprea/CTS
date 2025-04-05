package cts.task.practice.models.singleton.lazy;

import cts.task.practice.interfaces.IGSMConnection;

public class GSMConnection implements IGSMConnection {
    private int connectedPhonesCount;
    private static GSMConnection instance = null;

    private GSMConnection() {
        // If a connection gets created, that means a phone is using it.
        this.connectedPhonesCount = 1;
    }

    public static GSMConnection getInstance() {
        if(instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    @Override
    public void call() {
        this.connectedPhonesCount++;
    }
}
