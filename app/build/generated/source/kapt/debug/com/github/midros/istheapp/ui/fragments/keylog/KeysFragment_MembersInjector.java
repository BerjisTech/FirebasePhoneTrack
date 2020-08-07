package com.github.midros.istheapp.ui.fragments.keylog;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KeysFragment_MembersInjector implements MembersInjector<KeysFragment> {
  private final Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public KeysFragment_MembersInjector(
      Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<KeysFragment> create(
      Provider<InterfaceInteractorKeys<InterfaceViewKeys>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new KeysFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(KeysFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  public static void injectInteractor(
      KeysFragment instance, InterfaceInteractorKeys<InterfaceViewKeys> interactor) {
    instance.interactor = interactor;
  }

  public static void injectLayoutM(KeysFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
