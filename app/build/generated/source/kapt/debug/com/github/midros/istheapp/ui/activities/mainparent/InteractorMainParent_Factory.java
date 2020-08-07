package com.github.midros.istheapp.ui.activities.mainparent;

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
public final class InteractorMainParent_Factory<V extends InterfaceViewMainParent>
    implements Factory<InteractorMainParent<V>> {
  private final Provider<FragmentManager> supportFragmentProvider;

  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorMainParent_Factory(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    this.supportFragmentProvider = supportFragmentProvider;
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorMainParent<V> get() {
    return new InteractorMainParent<V>(
        supportFragmentProvider.get(), contextProvider.get(), firebaseProvider.get());
  }

  public static <V extends InterfaceViewMainParent> InteractorMainParent_Factory<V> create(
      Provider<FragmentManager> supportFragmentProvider,
      Provider<Context> contextProvider,
      Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorMainParent_Factory<V>(
        supportFragmentProvider, contextProvider, firebaseProvider);
  }
}
