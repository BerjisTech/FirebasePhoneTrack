package com.github.midros.istheapp.ui.activities.register;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider;

  public RegisterActivity_MembersInjector(
      Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<InterfaceInteractorRegister<InterfaceViewRegister>> interactorProvider) {
    return new RegisterActivity_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      RegisterActivity instance, InterfaceInteractorRegister<InterfaceViewRegister> interactor) {
    instance.interactor = interactor;
  }
}
