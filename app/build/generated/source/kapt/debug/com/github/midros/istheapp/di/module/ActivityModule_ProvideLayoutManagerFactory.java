package com.github.midros.istheapp.di.module;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLayoutManagerFactory
    implements Factory<LinearLayoutManager> {
  private final ActivityModule module;

  private final Provider<Context> contextProvider;

  public ActivityModule_ProvideLayoutManagerFactory(
      ActivityModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideLayoutManager(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideLayoutManagerFactory create(
      ActivityModule module, Provider<Context> contextProvider) {
    return new ActivityModule_ProvideLayoutManagerFactory(module, contextProvider);
  }

  public static LinearLayoutManager proxyProvideLayoutManager(
      ActivityModule instance, Context context) {
    return Preconditions.checkNotNull(
        instance.provideLayoutManager(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
