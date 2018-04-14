package uvsoftgroup.uvsoftgrouprediswebapp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Uvsoftgrouprediswebapp1Application {
	
	@Value(value = "${spring.redis.host}")
	private String redisHostName;
	@Value(value = "${spring.redis.port}")
	private int redisHostPort;

	public static void main(String[] args) {
		SpringApplication.run(Uvsoftgrouprediswebapp1Application.class, args);
	}
	
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
	    JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
	    jedisConFactory.setHostName(redisHostName);
	    jedisConFactory.setPort(redisHostPort);
	    return jedisConFactory;
	}
	
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(jedisConnectionFactory());
	    return template;
	}
	
	
}
