package org.springframework.test.aop;

/**
 * @Author troy
 * @Date 2025/5/16 下午1:43
 */
public interface UserService {

    void addUser(String userName);

    String getUserName(Integer userId);
}
