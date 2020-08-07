package com.github.midros.istheapp.services.notificationService;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorNotificationService_Factory
    implements Factory<InteractorNotificationService> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorNotificationService_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorNotificationService get() {
    return new InteractorNotificationService(contextProvider.get(), firebaseProvider.get());
  }

  public static InteractorNotificationService_Factory create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorNotificationService_Factory(contextProvider, firebaseProvider);
  }
}
