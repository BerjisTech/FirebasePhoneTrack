package com.github.midros.istheapp.services.accessibilityData;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorAccessibilityData_Factory
    implements Factory<InteractorAccessibilityData> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorAccessibilityData_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorAccessibilityData get() {
    return new InteractorAccessibilityData(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorAccessibilityData_Factory create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorAccessibilityData_Factory(contextProvider, firebaseProvider);
  }
}
