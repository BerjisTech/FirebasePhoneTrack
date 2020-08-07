package com.github.midros.istheapp.di.module;

import com.google.android.gms.maps.SupportMapFragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSupportMapFragmentFactory
    implements Factory<SupportMapFragment> {
  private final ActivityModule module;

  public ActivityModule_ProvideSupportMapFragmentFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public SupportMapFragment get() {
    return Preconditions.checkNotNull(
        module.provideSupportMapFragment(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideSupportMapFragmentFactory create(ActivityModule module) {
    return new ActivityModule_ProvideSupportMapFragmentFactory(module);
  }

  public static SupportMapFragment proxyProvideSupportMapFragment(ActivityModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSupportMapFragment(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
