package com.github.midros.istheapp.services.sms;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InteractorSms_Factory<S extends InterfaceServiceSms>
    implements Factory<InteractorSms<S>> {
  private final Provider<Context> contextProvider;

  private final Provider<InterfaceFirebase> firebaseProvider;

  public InteractorSms_Factory(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    this.contextProvider = contextProvider;
    this.firebaseProvider = firebaseProvider;
  }

  @Override
  public InteractorSms<S> get() {
    return new InteractorSms<S>(contextProvider.get(), firebaseProvider.get());
  }

  public static <S extends InterfaceServiceSms> InteractorSms_Factory<S> create(
      Provider<Context> contextProvider, Provider<InterfaceFirebase> firebaseProvider) {
    return new InteractorSms_Factory<S>(contextProvider, firebaseProvider);
  }
}
