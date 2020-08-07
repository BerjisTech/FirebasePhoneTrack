package com.github.midros.istheapp.ui.activities.login;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider;

  public LoginActivity_MembersInjector(
      Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<InterfaceInteractorLogin<InterfaceViewLogin>> interactorProvider) {
    return new LoginActivity_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      LoginActivity instance, InterfaceInteractorLogin<InterfaceViewLogin> interactor) {
    instance.interactor = interactor;
  }
}
