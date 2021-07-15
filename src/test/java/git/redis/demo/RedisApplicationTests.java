package git.redis.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {


        redisTemplate.opsForValue().set("mykey"," 关注狂神说公众号");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

}
