package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.activities.register.InteractorRegister;
import com.github.midros.istheapp.ui.activities.register.InterfaceInteractorRegister;
import com.github.midros.istheapp.ui.activities.register.InterfaceViewRegister;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorRegisterFactory
    implements Factory<InterfaceInteractorRegister<InterfaceViewRegister>> {
  private final ActivityModule module;

  private final Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorRegisterFactory(
      ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorRegister<InterfaceViewRegister> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorRegister(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorRegisterFactory create(
      ActivityModule module,
      Provider<InteractorRegister<InterfaceViewRegister>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorRegisterFactory(module, interactorProvider);
  }

  public static InterfaceInteractorRegister<InterfaceViewRegister>
      proxyProvideInterfaceInteractorRegister(
          ActivityModule instance, InteractorRegister<InterfaceViewRegister> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorRegister(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
