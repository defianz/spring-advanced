package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

import javax.security.auth.callback.Callback;


@Slf4j
public class TimeLogTemplate {

    public void execute(CallBack callback){
        long startTime = System.currentTimeMillis();

        callback.call();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
