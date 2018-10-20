package cn.xiaoyanol.sticker.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    /**
     * 将对象转为Json字符串
     * @param object
     * @return
     * @throws JsonProcessingException
     */
    public static String objectToJsonString(Object object)  {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(object);
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
