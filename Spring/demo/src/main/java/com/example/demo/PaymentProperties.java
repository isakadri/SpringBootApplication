package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("gateway-property")
public class PaymentProperties {
    private String type;
    private int timeOut;
    private int retryAcc;




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public int getRetryAcc() {
        return retryAcc;
    }

    public void setRetryAcc(int retryAcc) {
        this.retryAcc = retryAcc;
    }

    @Override
    public String toString() {
        return "PaymentProperties{" +
                "type='" + type + '\'' +
                ", timeOut=" + timeOut +
                ", retryAcc=" + retryAcc +
                '}';
    }
}
