package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.calls.InteractorCalls;
import com.github.midros.istheapp.ui.fragments.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.ui.fragments.calls.InterfaceViewCalls;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorCallsFactory
    implements Factory<InterfaceInteractorCalls<InterfaceViewCalls>> {
  private final ActivityModule module;

  private final Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorCallsFactory(
      ActivityModule module, Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorCalls<InterfaceViewCalls> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorCalls(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorCallsFactory create(
      ActivityModule module, Provider<InteractorCalls<InterfaceViewCalls>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorCallsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorCalls<InterfaceViewCalls> proxyProvideInterfaceInteractorCalls(
      ActivityModule instance, InteractorCalls<InterfaceViewCalls> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorCalls(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
