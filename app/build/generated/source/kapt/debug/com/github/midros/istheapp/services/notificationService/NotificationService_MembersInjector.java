package com.github.midros.istheapp.services.notificationService;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationService_MembersInjector
    implements MembersInjector<NotificationService> {
  private final Provider<InteractorNotificationService> interactorProvider;

  public NotificationService_MembersInjector(
      Provider<InteractorNotificationService> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<NotificationService> create(
      Provider<InteractorNotificationService> interactorProvider) {
    return new NotificationService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(NotificationService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      NotificationService instance, InteractorNotificationService interactor) {
    instance.interactor = interactor;
  }
}
