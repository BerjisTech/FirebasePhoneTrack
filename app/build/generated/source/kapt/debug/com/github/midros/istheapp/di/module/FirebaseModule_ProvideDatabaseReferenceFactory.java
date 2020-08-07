package com.github.midros.istheapp.di.module;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideDatabaseReferenceFactory
    implements Factory<DatabaseReference> {
  private final FirebaseModule module;

  private final Provider<FirebaseDatabase> databaseProvider;

  public FirebaseModule_ProvideDatabaseReferenceFactory(
      FirebaseModule module, Provider<FirebaseDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DatabaseReference get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseReference(databaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideDatabaseReferenceFactory create(
      FirebaseModule module, Provider<FirebaseDatabase> databaseProvider) {
    return new FirebaseModule_ProvideDatabaseReferenceFactory(module, databaseProvider);
  }

  public static DatabaseReference proxyProvideDatabaseReference(
      FirebaseModule instance, FirebaseDatabase database) {
    return Preconditions.checkNotNull(
        instance.provideDatabaseReference(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
