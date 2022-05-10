package mao.spring_boot_cache_redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * Project name(项目名称)：spring_boot_cache_redis
 * Package(包名): mao.spring_boot_cache_redis.config
 * Class(类名): RedisConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/10
 * Time(创建时间)： 12:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class RedisConfig
{
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory)
//    {
//        //创建RedisTemplate
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        //创建连接工厂
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        //设置序列化工具，可以用阿里巴巴的FastJson
//        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
//        //key和hashKey采用 string序列化
//        redisTemplate.setKeySerializer(RedisSerializer.string());
//        redisTemplate.setHashKeySerializer(RedisSerializer.string());
//        //value和hashValue采用JSON序列化
//        redisTemplate.setValueSerializer(genericJackson2JsonRedisSerializer);
//        redisTemplate.setHashValueSerializer(genericJackson2JsonRedisSerializer);
//        //返回
//        return redisTemplate;
//    }
}

