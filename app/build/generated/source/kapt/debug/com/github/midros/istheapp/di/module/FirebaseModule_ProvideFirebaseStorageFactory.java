package com.github.midros.istheapp.di.module;

import com.google.firebase.storage.FirebaseStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideFirebaseStorageFactory
    implements Factory<FirebaseStorage> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFirebaseStorageFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseStorage get() {
    return Preconditions.checkNotNull(
        module.provideFirebaseStorage(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideFirebaseStorageFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFirebaseStorageFactory(module);
  }

  public static FirebaseStorage proxyProvideFirebaseStorage(FirebaseModule instance) {
    return Preconditions.checkNotNull(
        instance.provideFirebaseStorage(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
