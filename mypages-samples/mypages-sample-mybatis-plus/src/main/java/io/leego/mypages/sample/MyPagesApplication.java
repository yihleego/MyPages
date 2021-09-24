package io.leego.mypages.sample;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.leego.mypages.sample.entity.User;
import io.leego.mypages.sample.mapper.UserMapper;
import io.leego.mypages.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Yihleego
 */
@SpringBootApplication
public class MyPagesApplication {
    private static final Logger logger = LoggerFactory.getLogger(MyPagesApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyPagesApplication.class, args);
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        int i = 0;
        while (true) {
            List<User> list = userMapper.query(++i, 10, 1, LocalDateTime.now());
            Page<User> page = Page.of(list);
            logger.info("{}", page);
            if (!page.getNext()) {
                break;
            }
        }
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("id", 1L));
        logger.info("{}", user);
    }

}
