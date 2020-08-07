package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.activities.mainparent.InteractorMainParent;
import com.github.midros.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent;
import com.github.midros.istheapp.ui.activities.mainparent.InterfaceViewMainParent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorMainFactory
    implements Factory<InterfaceInteractorMainParent<InterfaceViewMainParent>> {
  private final ActivityModule module;

  private final Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider;

  public ActivityModule_ProvideInterfaceInteractorMainFactory(
      ActivityModule module,
      Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    this.module = module;
    this.interactorParentProvider = interactorParentProvider;
  }

  @Override
  public InterfaceInteractorMainParent<InterfaceViewMainParent> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorMain(interactorParentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorMainFactory create(
      ActivityModule module,
      Provider<InteractorMainParent<InterfaceViewMainParent>> interactorParentProvider) {
    return new ActivityModule_ProvideInterfaceInteractorMainFactory(
        module, interactorParentProvider);
  }

  public static InterfaceInteractorMainParent<InterfaceViewMainParent>
      proxyProvideInterfaceInteractorMain(
          ActivityModule instance, InteractorMainParent<InterfaceViewMainParent> interactorParent) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorMain(interactorParent),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
