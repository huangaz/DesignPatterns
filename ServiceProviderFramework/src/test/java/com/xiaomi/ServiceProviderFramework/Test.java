package com.xiaomi.ServiceProviderFramework;

/**
 * 测试类
 */
public class Test {
  public static void main(String[] args) {
    try {
      Class.forName("com.xiaomi.ServiceProviderFramework.Impl.UserServiceProviderImpl");

      UserService userService = ServiceManager.getService("Register&Login");
      userService.register();
      userService.login();

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
