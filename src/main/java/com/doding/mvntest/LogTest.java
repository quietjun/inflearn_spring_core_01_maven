package com.doding.mvntest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogTest {
    // static Logger log = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        // System.out.println(log);
        log.trace("trace: {}, {}, {}", "trace", 10, true);
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
