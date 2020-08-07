package com.github.midros.istheapp.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideContextFactory implements Factory<Context> {
  private final ServiceModule module;

  public ServiceModule_ProvideContextFactory(ServiceModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ServiceModule_ProvideContextFactory create(ServiceModule module) {
    return new ServiceModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(ServiceModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
