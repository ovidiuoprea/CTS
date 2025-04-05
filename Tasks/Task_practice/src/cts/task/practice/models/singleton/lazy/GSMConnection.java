package cts.task.practice.models.singleton.lazy;

import cts.task.practice.interfaces.IGSMConnection;

public class GSMConnection implements IGSMConnection {
    private int activeCalls;
    private static GSMConnection instance = null;

    private GSMConnection() {
        this.activeCalls = 0;
    }

    public static GSMConnection getInstance() {
        if(instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    @Override
    public void call() {
        this.activeCalls++;
    }

    public int getActiveCalls() {
        return activeCalls;
    }
}
