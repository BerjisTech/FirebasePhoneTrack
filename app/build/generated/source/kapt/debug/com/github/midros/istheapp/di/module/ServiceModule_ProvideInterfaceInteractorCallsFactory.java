package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.services.calls.InteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceServiceCalls;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideInterfaceInteractorCallsFactory
    implements Factory<InterfaceInteractorCalls<InterfaceServiceCalls>> {
  private final ServiceModule module;

  private final Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider;

  public ServiceModule_ProvideInterfaceInteractorCallsFactory(
      ServiceModule module, Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorCalls<InterfaceServiceCalls> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorCalls(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ServiceModule_ProvideInterfaceInteractorCallsFactory create(
      ServiceModule module, Provider<InteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    return new ServiceModule_ProvideInterfaceInteractorCallsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorCalls<InterfaceServiceCalls>
      proxyProvideInterfaceInteractorCalls(
          ServiceModule instance, InteractorCalls<InterfaceServiceCalls> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorCalls(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
