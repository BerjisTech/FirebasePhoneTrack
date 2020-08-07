package com.github.midros.istheapp.ui.fragments.calls;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallsFragment_MembersInjector implements MembersInjector<CallsFragment> {
  private final Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public CallsFragment_MembersInjector(
      Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<CallsFragment> create(
      Provider<InterfaceInteractorCalls<InterfaceViewCalls>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new CallsFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(CallsFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  public static void injectInteractor(
      CallsFragment instance, InterfaceInteractorCalls<InterfaceViewCalls> interactor) {
    instance.interactor = interactor;
  }

  public static void injectLayoutM(CallsFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
