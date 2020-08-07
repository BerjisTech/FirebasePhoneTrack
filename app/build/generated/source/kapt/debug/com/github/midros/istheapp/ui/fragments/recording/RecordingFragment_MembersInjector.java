package com.github.midros.istheapp.ui.fragments.recording;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RecordingFragment_MembersInjector implements MembersInjector<RecordingFragment> {
  private final Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider;

  private final Provider<LinearLayoutManager> layoutMProvider;

  public RecordingFragment_MembersInjector(
      Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    this.interactorProvider = interactorProvider;
    this.layoutMProvider = layoutMProvider;
  }

  public static MembersInjector<RecordingFragment> create(
      Provider<InterfaceInteractorRecording<InterfaceViewRecording>> interactorProvider,
      Provider<LinearLayoutManager> layoutMProvider) {
    return new RecordingFragment_MembersInjector(interactorProvider, layoutMProvider);
  }

  @Override
  public void injectMembers(RecordingFragment instance) {
    injectInteractor(instance, interactorProvider.get());
    injectLayoutM(instance, layoutMProvider.get());
  }

  public static void injectInteractor(
      RecordingFragment instance, InterfaceInteractorRecording<InterfaceViewRecording> interactor) {
    instance.interactor = interactor;
  }

  public static void injectLayoutM(RecordingFragment instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }
}
