package org.springframework.test.aop;

/**
 * @Author troy
 * @Date 2025/5/16 下午1:44
 */
public class UserServiceImpl implements UserService{

    @Override
    public void addUser(String userName) {
        System.out.println("add user");
    }

    @Override
    public String getUserName(Integer userId) {
        System.out.println("get user");
        return "张三";
    }

    public void listUser() {
        System.out.println("list user");
    }
}
