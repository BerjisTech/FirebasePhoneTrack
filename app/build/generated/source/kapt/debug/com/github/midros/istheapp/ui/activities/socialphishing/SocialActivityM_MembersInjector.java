package com.github.midros.istheapp.ui.activities.socialphishing;

import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SocialActivityM_MembersInjector implements MembersInjector<SocialActivityM> {
  private final Provider<InterfaceFirebase> firebaseProvider;

  public SocialActivityM_MembersInjector(Provider<InterfaceFirebase> firebaseProvider) {
    this.firebaseProvider = firebaseProvider;
  }

  public static MembersInjector<SocialActivityM> create(
      Provider<InterfaceFirebase> firebaseProvider) {
    return new SocialActivityM_MembersInjector(firebaseProvider);
  }

  @Override
  public void injectMembers(SocialActivityM instance) {
    injectFirebase(instance, firebaseProvider.get());
  }

  public static void injectFirebase(SocialActivityM instance, InterfaceFirebase firebase) {
    instance.firebase = firebase;
  }
}
