package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.strategy.ContextV2;
import hello.advanced.trace.strategy.code.strategy.Strategy;
import hello.advanced.trace.strategy.code.strategy.StrategyLogic1;
import hello.advanced.trace.strategy.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    @Test
    public void StrategyV1() throws Exception {
        ContextV2 context = new ContextV2();
        context.excute(new StrategyLogic1());
        context.excute(new StrategyLogic2());
    }

    @Test
    public void StrategyV2() throws Exception {
        ContextV2 context = new ContextV2();
        context.excute(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1");
            }
        });
        context.excute(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2");
            }
        });
    }

    @Test
    public void StrategyV3() throws Exception {
        ContextV2 context = new ContextV2();
        context.excute(() -> log.info("비즈니스 로직1"));
        context.excute(() -> log.info("비즈니스 로직2"));
    }
}
