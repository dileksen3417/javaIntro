package com.company;

public class Main {

    public static void main(String[] args) {
        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
        for(BaseLogger baseLogger:baseLoggers){
            baseLogger.log("-log mesajı-");
        }
    }
}
