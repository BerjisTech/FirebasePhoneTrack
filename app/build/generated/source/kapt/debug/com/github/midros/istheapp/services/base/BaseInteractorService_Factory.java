package com.github.midros.istheapp.services.base;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseInteractorService_Factory<S extends InterfaceService>
    implements Factory<BaseInteractorService<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public BaseInteractorService_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public BaseInteractorService<S> get() {
    return new BaseInteractorService<S>(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceService> BaseInteractorService_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new BaseInteractorService_Factory<S>(contextProvider, firebaseProvider);
  }
}
