package cn.coonu.framework.common.log;

import org.slf4j.Logger;

/**
 * 此类作用是在其他类中使用,就不用每次都写if判断debug是否启用;
 * 但是在用测试类测试不起作用,不知道在正常编码中起不起作用;
 *
 */
public class Log {

    private final Logger logger;

    public Log(Logger logger) {
        this.logger = logger;
    }

    public void debug(String msg, Object... args) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg, args);
        }
    }


}
