package com.github.midros.istheapp.ui.activities.mainchild;

import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainChildActivity_MembersInjector implements MembersInjector<MainChildActivity> {
  private final Provider<InterfaceFirebase> firebaseProvider;

  public MainChildActivity_MembersInjector(Provider<InterfaceFirebase> firebaseProvider) {
    this.firebaseProvider = firebaseProvider;
  }

  public static MembersInjector<MainChildActivity> create(
      Provider<InterfaceFirebase> firebaseProvider) {
    return new MainChildActivity_MembersInjector(firebaseProvider);
  }

  @Override
  public void injectMembers(MainChildActivity instance) {
    injectFirebase(instance, firebaseProvider.get());
  }

  public static void injectFirebase(MainChildActivity instance, InterfaceFirebase firebase) {
    instance.firebase = firebase;
  }
}
