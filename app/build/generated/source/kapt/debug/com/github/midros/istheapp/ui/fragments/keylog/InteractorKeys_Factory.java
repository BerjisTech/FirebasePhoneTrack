package com.github.midros.istheapp.ui.fragments.keylog;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorKeys_Factory<V extends InterfaceViewKeys>
    implements Factory<InteractorKeys<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorKeys_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorKeys<V> get() {
    return new InteractorKeys<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewKeys> InteractorKeys_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorKeys_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
