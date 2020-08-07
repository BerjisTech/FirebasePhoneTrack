package com.github.midros.istheapp.di.module;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFirebaseAuthFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseAuth get() {
    return Preconditions.checkNotNull(
        module.provideFirebaseAuth(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideFirebaseAuthFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFirebaseAuthFactory(module);
  }

  public static FirebaseAuth proxyProvideFirebaseAuth(FirebaseModule instance) {
    return Preconditions.checkNotNull(
        instance.provideFirebaseAuth(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
