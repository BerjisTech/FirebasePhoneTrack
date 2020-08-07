package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.message.InteractorMessage;
import com.github.midros.istheapp.ui.fragments.message.InterfaceInteractorMessage;
import com.github.midros.istheapp.ui.fragments.message.InterfaceViewMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorMessageFactory
    implements Factory<InterfaceInteractorMessage<InterfaceViewMessage>> {
  private final ActivityModule module;

  private final Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorMessageFactory(
      ActivityModule module, Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorMessage<InterfaceViewMessage> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorMessage(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorMessageFactory create(
      ActivityModule module, Provider<InteractorMessage<InterfaceViewMessage>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMessageFactory(module, interactorProvider);
  }

  public static InterfaceInteractorMessage<InterfaceViewMessage>
      proxyProvideInterfaceInteractorMessage(
          ActivityModule instance, InteractorMessage<InterfaceViewMessage> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorMessage(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
