package com.github.midros.istheapp.di.module;

import com.github.midros.istheapp.ui.fragments.recording.InteractorRecording;
import com.github.midros.istheapp.ui.fragments.recording.InterfaceInteractorRecording;
import com.github.midros.istheapp.ui.fragments.recording.InterfaceViewRecording;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideInterfaceInteractorRecordingFactory
    implements Factory<InterfaceInteractorRecording<InterfaceViewRecording>> {
  private final ActivityModule module;

  private final Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider;

  public ActivityModule_ProvideInterfaceInteractorRecordingFactory(
      ActivityModule module,
      Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider) {
    this.module = module;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public InterfaceInteractorRecording<InterfaceViewRecording> get() {
    return Preconditions.checkNotNull(
        module.provideInterfaceInteractorRecording(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ActivityModule_ProvideInterfaceInteractorRecordingFactory create(
      ActivityModule module,
      Provider<InteractorRecording<InterfaceViewRecording>> interactorProvider) {
    return new ActivityModule_ProvideInterfaceInteractorRecordingFactory(
        module, interactorProvider);
  }

  public static InterfaceInteractorRecording<InterfaceViewRecording>
      proxyProvideInterfaceInteractorRecording(
          ActivityModule instance, InteractorRecording<InterfaceViewRecording> interactor) {
    return Preconditions.checkNotNull(
        instance.provideInterfaceInteractorRecording(interactor),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
