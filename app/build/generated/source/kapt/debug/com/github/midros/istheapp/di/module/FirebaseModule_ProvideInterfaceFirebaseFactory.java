package com.github.midros.istheapp.di.module;

import android.content.Context;
import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirebaseModule_ProvideInterfaceFirebaseFactory
    implements Factory<InterfaceFirebase> {
  private final FirebaseModule module;

  private final Provider<Context> contextProvider;

  private final Provider<FirebaseAuth> authProvider;

  private final Provider<DatabaseReference> dataRefProvider;

  private final Provider<StorageReference> stoRefProvider;

  public FirebaseModule_ProvideInterfaceFirebaseFactory(
      FirebaseModule module,
      Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.authProvider = authProvider;
    this.dataRefProvider = dataRefProvider;
    this.stoRefProvider = stoRefProvider;
  }

  @Override
  public InterfaceFirebase get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceFirebase(
            contextProvider.get(), authProvider.get(), dataRefProvider.get(), stoRefProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static FirebaseModule_ProvideInterfaceFirebaseFactory create(
      FirebaseModule module,
      Provider<Context> contextProvider,
      Provider<FirebaseAuth> authProvider,
      Provider<DatabaseReference> dataRefProvider,
      Provider<StorageReference> stoRefProvider) {
    return new FirebaseModule_ProvideInterfaceFirebaseFactory(
        module, contextProvider, authProvider, dataRefProvider, stoRefProvider);
  }

  public static InterfaceFirebase proxyProvideInterfaceFirebase(
      FirebaseModule instance,
      Context context,
      FirebaseAuth auth,
      DatabaseReference dataRef,
      StorageReference stoRef) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceFirebase(context, auth, dataRef, stoRef),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
