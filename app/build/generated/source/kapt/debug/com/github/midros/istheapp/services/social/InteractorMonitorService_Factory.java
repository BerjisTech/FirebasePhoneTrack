package com.github.midros.istheapp.services.social;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorMonitorService_Factory implements Factory<InteractorMonitorService> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorMonitorService_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorMonitorService get() {
    return new InteractorMonitorService(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorMonitorService_Factory create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorMonitorService_Factory(contextProvider, firebaseProvider);
  }
}
