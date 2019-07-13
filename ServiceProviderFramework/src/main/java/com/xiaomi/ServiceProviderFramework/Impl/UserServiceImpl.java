package com.xiaomi.ServiceProviderFramework.Impl;

import com.xiaomi.ServiceProviderFramework.UserService;

/**
 * 服务具体实现类
 */
public class UserServiceImpl implements UserService {
  @Override
  public void login() {
    System.out.println("Login Successfully!");
  }

  @Override
  public void register() {
    System.out.println("Register Successfully!");
  }
}
