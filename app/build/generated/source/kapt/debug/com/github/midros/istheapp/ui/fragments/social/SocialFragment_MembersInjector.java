package com.github.midros.istheapp.ui.fragments.social;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SocialFragment_MembersInjector implements MembersInjector<SocialFragment> {
  private final Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider;

  public SocialFragment_MembersInjector(
      Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<SocialFragment> create(
      Provider<InterfaceInteractorSocial<InterfaceViewSocial>> interactorProvider) {
    return new SocialFragment_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(SocialFragment instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      SocialFragment instance, InterfaceInteractorSocial<InterfaceViewSocial> interactor) {
    instance.interactor = interactor;
  }
}
