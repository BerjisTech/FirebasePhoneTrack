package com.github.midros.istheapp.di.module;

import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideFirebaseDatabaseFactory
    implements Factory<FirebaseDatabase> {
  private final FirebaseModule module;

  public FirebaseModule_ProvideFirebaseDatabaseFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseDatabase get() {
    return Preconditions.checkNotNull(
        module.provideFirebaseDatabase(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideFirebaseDatabaseFactory create(FirebaseModule module) {
    return new FirebaseModule_ProvideFirebaseDatabaseFactory(module);
  }

  public static FirebaseDatabase proxyProvideFirebaseDatabase(FirebaseModule instance) {
    return Preconditions.checkNotNull(
        instance.provideFirebaseDatabase(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
