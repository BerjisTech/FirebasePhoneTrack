package com.github.midros.istheapp.services.accessibilityData;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessibilityDataService_MembersInjector
    implements MembersInjector<AccessibilityDataService> {
  private final Provider<InteractorAccessibilityData> interactorProvider;

  public AccessibilityDataService_MembersInjector(
      Provider<InteractorAccessibilityData> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<AccessibilityDataService> create(
      Provider<InteractorAccessibilityData> interactorProvider) {
    return new AccessibilityDataService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(AccessibilityDataService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      AccessibilityDataService instance, InteractorAccessibilityData interactor) {
    instance.interactor = interactor;
  }
}
