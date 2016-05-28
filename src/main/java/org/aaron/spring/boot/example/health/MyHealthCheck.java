package org.aaron.spring.boot.example.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class MyHealthCheck extends AbstractHealthIndicator {

    private static final Logger LOG = LoggerFactory.getLogger(MyHealthCheck.class);

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        try {
            LOG.info("doHealthCheck");
            // do something
            builder.down();
        } catch (Exception e) {
            builder.down(e);
        }

    }

}
