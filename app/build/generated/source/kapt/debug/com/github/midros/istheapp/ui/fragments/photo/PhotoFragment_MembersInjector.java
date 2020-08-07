package com.github.midros.istheapp.ui.fragments.photo;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhotoFragment_MembersInjector implements MembersInjector<PhotoFragment> {
  private final Provider<LinearLayoutManager> layoutMProvider;

  private final Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider;

  public PhotoFragment_MembersInjector(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    this.layoutMProvider = layoutMProvider;
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<PhotoFragment> create(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    return new PhotoFragment_MembersInjector(layoutMProvider, interactorProvider);
  }

  @Override
  public void injectMembers(PhotoFragment instance) {
    injectLayoutM(instance, layoutMProvider.get());
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectLayoutM(PhotoFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }

  public static void injectInteractor(
      PhotoFragment instance, InterfaceInteractorPhoto<InterfaceViewPhoto> interactor) {
    instance.interactor = interactor;
  }
}
