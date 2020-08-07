package com.github.midros.istheapp.services.sms;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SmsService_MembersInjector implements MembersInjector<SmsService> {
  private final Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider;

  public SmsService_MembersInjector(
      Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<SmsService> create(
      Provider<InterfaceInteractorSms<InterfaceServiceSms>> interactorProvider) {
    return new SmsService_MembersInjector(interactorProvider);
  }

  @Override
  public void injectMembers(SmsService instance) {
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectInteractor(
      SmsService instance, InterfaceInteractorSms<InterfaceServiceSms> interactor) {
    instance.interactor = interactor;
  }
}
