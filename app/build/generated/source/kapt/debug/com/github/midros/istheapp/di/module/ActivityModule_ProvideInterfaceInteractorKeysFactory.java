package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.keylog.InteractorKeys;
import com.github.midros.istheapp.ui.fragments.keylog.InterfaceInteractorKeys;
import com.github.midros.istheapp.ui.fragments.keylog.InterfaceViewKeys;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorKeysFactory
    implements Factory<InterfaceInteractorKeys<InterfaceViewKeys>> {
  private final ActivityModule module;

  private final Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorKeysFactory(
      ActivityModule module, Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorKeys<InterfaceViewKeys> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorKeys(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorKeysFactory create(
      ActivityModule module, Provider<InteractorKeys<InterfaceViewKeys>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorKeysFactory(module, interactorProvider);
  }

  public static InterfaceInteractorKeys<InterfaceViewKeys> proxyProvideInterfaceInteractorKeys(
      ActivityModule instance, InteractorKeys<InterfaceViewKeys> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorKeys(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
