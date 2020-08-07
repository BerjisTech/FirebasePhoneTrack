package com.github.midros.istheapp.data.rxFirebase;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DevelopFirebase_Factory implements Factory<DevelopFirebase> {
  private final Provider<Context> contextProvider;

  private final Provider<FirebaseAuth> authProvider;

  private final Provider<DatabaseReference> dataRefProvider;

  private final Provider<StorageReference> stoRefProvider;

  public DevelopFirebase_Factory(
      Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    this.contextProvider = contextProvider;
    this.authProvider = authProvider;
    this.dataRefProvider = dataRefProvider;
    this.stoRefProvider = stoRefProvider;
  }

  @Override
  public DevelopFirebase get() {
    return new DevelopFirebase(
        contextProvider.get(), authProvider.get(), dataRefProvider.get(), stoRefProvider.get());
  }

  public static DevelopFirebase_Factory create(
      Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    return new DevelopFirebase_Factory(
        contextProvider, authProvider, dataRefProvider, stoRefProvider);
  }
}
