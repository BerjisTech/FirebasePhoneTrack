package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.services.sms.InteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceInteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceServiceSms;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideInterfaceInteractorSmsFactory
    implements Factory<InterfaceInteractorSms<InterfaceServiceSms>> {
  private final ServiceModule module;

  private final Provider<InteractorSms<InterfaceServiceSms>> interactorProvider;

  public ServiceModule_ProvideInterfaceInteractorSmsFactory(
      ServiceModule module, Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorSms<InterfaceServiceSms> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorSms(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ServiceModule_ProvideInterfaceInteractorSmsFactory create(
      ServiceModule module, Provider<InteractorSms<InterfaceServiceSms>> interactorProvider) {
    return new ServiceModule_ProvideInterfaceInteractorSmsFactory(module, interactorProvider);
  }

  public static InterfaceInteractorSms<InterfaceServiceSms> proxyProvideInterfaceInteractorSms(
      ServiceModule instance, InteractorSms<InterfaceServiceSms> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorSms(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
