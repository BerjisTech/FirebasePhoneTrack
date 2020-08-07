package com.github.midros.istheapp.di.module;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideStorageReferenceFactory
    implements Factory<StorageReference> {
  private final FirebaseModule module;

  private final Provider<FirebaseStorage> storageProvider;

  public FirebaseModule_ProvideStorageReferenceFactory(
      FirebaseModule module, Provider<FirebaseStorage> storageProvider) {
    this.module = module;
    this.storageProvider = storageProvider;
  }

  @Override
  public StorageReference get() {
    return Preconditions.checkNotNull(
        module.provideStorageReference(storageProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideStorageReferenceFactory create(
      FirebaseModule module, Provider<FirebaseStorage> storageProvider) {
    return new FirebaseModule_ProvideStorageReferenceFactory(module, storageProvider);
  }

  public static StorageReference proxyProvideStorageReference(
      FirebaseModule instance, FirebaseStorage storage) {
    return Preconditions.checkNotNull(
        instance.provideStorageReference(storage),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
