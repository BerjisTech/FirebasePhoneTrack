package com.github.midros.istheapp.ui.fragments.maps;

import com.google.android.gms.maps.SupportMapFragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MapsFragment_MembersInjector implements MembersInjector<MapsFragment> {
  private final Provider<SupportMapFragment> mapsFragmentProvider;

  private final Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider;

  public MapsFragment_MembersInjector(
      Provider<SupportMapFragment> mapsFragmentProvider,
      Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider) {
    this.mapsFragmentProvider = mapsFragmentProvider;
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<MapsFragment> create(
      Provider<SupportMapFragment> mapsFragmentProvider,
      Provider<InterfaceInteractorMaps<InterfaceViewMaps>> interactorProvider) {
    return new MapsFragment_MembersInjector(mapsFragmentProvider, interactorProvider);
  }

  @Override
  public void injectMembers(MapsFragment instance) {
    injectMapsFragment(instance, mapsFragmentProvider.get());
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectMapsFragment(MapsFragment instance, SupportMapFragment mapsFragment) {
    instance.mapsFragment = mapsFragment;
  }

  public static void injectInteractor(
      MapsFragment instance, InterfaceInteractorMaps<InterfaceViewMaps> interactor) {
    instance.interactor = interactor;
  }
}
