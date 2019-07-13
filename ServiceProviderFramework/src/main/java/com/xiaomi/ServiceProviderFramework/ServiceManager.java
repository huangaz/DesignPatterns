package com.xiaomi.ServiceProviderFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务管理类
 */
public class ServiceManager {

  private ServiceManager() {}

  private static final Map<String, UserServiceProvider> providers = new ConcurrentHashMap<>();

  public static void registerProvider(String name, UserServiceProvider provider) {
    providers.put(name, provider);
  }

  public static UserService getService(String name) {
    UserServiceProvider provider = providers.get(name);
    if (provider == null) {
      throw new IllegalArgumentException("No provider registered with name=" + name);
    }

    return provider.getUserService();
  }
}
