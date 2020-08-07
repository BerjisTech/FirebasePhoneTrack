package com.github.midros.istheapp.services.social;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonitorService_MembersInjector implements MembersInjector<MonitorService> {
  private final Provider<InteractorMonitorService> interactorProvider;

  public MonitorService_MembersInjector(Provider<InteractorMonitorService> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<MonitorService> create(
      Provider<InteractorMonitorService> interactorProvider) {
    return new MonitorService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(MonitorService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      MonitorService instance, InteractorMonitorService interactor) {
    instance.interactor = interactor;
  }
}
