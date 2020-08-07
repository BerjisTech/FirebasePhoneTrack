package com.github.midros.istheapp.services.calls;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallsService_MembersInjector implements MembersInjector<CallsService> {
  private final Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider;

  public CallsService_MembersInjector(
      Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<CallsService> create(
      Provider<InterfaceInteractorCalls<InterfaceServiceCalls>> interactorProvider) {
    return new CallsService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(CallsService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      CallsService instance, InterfaceInteractorCalls<InterfaceServiceCalls> interactor) {
    instance.interactor = interactor;
  }
}
