package com.xiaomi.ServiceProviderFramework.Impl;

import com.xiaomi.ServiceProviderFramework.ServiceManager;
import com.xiaomi.ServiceProviderFramework.UserService;
import com.xiaomi.ServiceProviderFramework.UserServiceProvider;

/**
 * 服务提供者具体实现类
 */
public class UserServiceProviderImpl implements UserServiceProvider {

  static {
    ServiceManager.registerProvider("Register&Login", new UserServiceProviderImpl());
  }

  @Override
  public UserService getUserService() {
    return new UserServiceImpl();
  }
}
