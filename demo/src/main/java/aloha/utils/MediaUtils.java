package aloha.utils;

import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

public class MediaUtils {
    private static Map<String, String> mediaMap;

    static {
        mediaMap = new HashMap<>();
        mediaMap.put("JPG", MediaType.IMAGE_JPEG.toString());
        mediaMap.put("GIF", MediaType.IMAGE_GIF.toString());
        mediaMap.put("PNG", MediaType.IMAGE_PNG.toString());
        mediaMap.put("WEBP", "image/webp"); // 최근에 만들어진 이미지 포맷
    }

    public static String getMediaType(String type) {
        return mediaMap.get(type.toUpperCase());
    }
}
