package com.github.midros.istheapp.ui.fragments.calls;

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
public final class InteractorCalls_Factory<V extends InterfaceViewCalls>
    implements Factory<InteractorCalls<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorCalls_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorCalls<V> get() {
    return new InteractorCalls<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewCalls> InteractorCalls_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorCalls_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
