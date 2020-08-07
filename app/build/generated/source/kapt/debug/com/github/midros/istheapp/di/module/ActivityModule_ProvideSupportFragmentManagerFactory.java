package com.github.midros.istheapp.di.module;

import androidx.fragment.app.FragmentManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSupportFragmentManagerFactory
    implements Factory<FragmentManager> {
  private final ActivityModule module;

  public ActivityModule_ProvideSupportFragmentManagerFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public FragmentManager get() {
    return Preconditions.checkNotNull(
        module.provideSupportFragmentManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideSupportFragmentManagerFactory create(ActivityModule module) {
    return new ActivityModule_ProvideSupportFragmentManagerFactory(module);
  }

  public static FragmentManager proxyProvideSupportFragmentManager(ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSupportFragmentManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
