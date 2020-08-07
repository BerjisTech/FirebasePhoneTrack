package com.github.midros.istheapp.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideContextFactory implements Factory<Context> {
  private final ActivityModule module;

  public ActivityModule_ProvideContextFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideContextFactory create(ActivityModule module) {
    return new ActivityModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
