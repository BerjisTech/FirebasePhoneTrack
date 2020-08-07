package com.github.midros.istheapp.services.calls;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorCalls_Factory<S extends InterfaceServiceCalls>
    implements Factory<InteractorCalls<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorCalls_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorCalls<S> get() {
    return new InteractorCalls<S>(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceServiceCalls> InteractorCalls_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorCalls_Factory<S>(contextProvider, firebaseProvider);
  }
}
