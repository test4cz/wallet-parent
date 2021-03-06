package org.wallet.service.batch;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.wallet.service.batch.run.ServiceStarter;

/**
 * Spring Boot 测试基类
 *
 * @author zengfucheng
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceStarter.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ActiveProfiles("local")
public class SpringBootJUnitTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Before
    public void setupMockMvc() {
    }

    @Test
    public void loadContext() {
    }


}
