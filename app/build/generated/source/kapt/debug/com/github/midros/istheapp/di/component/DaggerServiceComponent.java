package com.github.midros.istheapp.di.component;

import com.github.midros.istheapp.data.rxFirebase.InterfaceFirebase;
import com.github.midros.istheapp.di.module.ServiceModule;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideContextFactory;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideInterfaceInteractorCallsFactory;
import com.github.midros.istheapp.di.module.ServiceModule_ProvideInterfaceInteractorSmsFactory;
import com.github.midros.istheapp.services.calls.CallsService;
import com.github.midros.istheapp.services.calls.CallsService_MembersInjector;
import com.github.midros.istheapp.services.calls.InteractorCalls_Factory;
import com.github.midros.istheapp.services.calls.InterfaceInteractorCalls;
import com.github.midros.istheapp.services.calls.InterfaceServiceCalls;
import com.github.midros.istheapp.services.sms.InteractorSms_Factory;
import com.github.midros.istheapp.services.sms.InterfaceInteractorSms;
import com.github.midros.istheapp.services.sms.InterfaceServiceSms;
import com.github.midros.istheapp.services.sms.SmsService;
import com.github.midros.istheapp.services.sms.SmsService_MembersInjector;
import com.github.midros.istheapp.services.social.InteractorMonitorService;
import com.github.midros.istheapp.services.social.MonitorService;
import com.github.midros.istheapp.services.social.MonitorService_MembersInjector;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
  private ServiceModule serviceModule;

  private AppComponent appComponent;

  private ServiceModule_ProvideContextFactory provideContextProvider;

  private com_github_midros_istheapp_di_component_AppComponent_getInterfaceFirebase
      getInterfaceFirebaseProvider;

  private InteractorCalls_Factory interactorCallsProvider;

  private Provider<InterfaceInteractorCalls<InterfaceServiceCalls>>
      provideInterfaceInteractorCallsProvider;

  private InteractorSms_Factory interactorSmsProvider;

  private Provider<InterfaceInteractorSms<InterfaceServiceSms>>
      provideInterfaceInteractorSmsProvider;

  private DaggerServiceComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private InteractorMonitorService getInteractorMonitorService() {
    return new InteractorMonitorService(
        ServiceModule_ProvideContextFactory.proxyProvideContext(serviceModule),
        Preconditions.checkNotNull(
            appComponent.getInterfaceFirebase(),
            "Cannot return null from a non-@Nullable component method"));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideContextProvider = ServiceModule_ProvideContextFactory.create(builder.serviceModule);
    this.getInterfaceFirebaseProvider =
        new com_github_midros_istheapp_di_component_AppComponent_getInterfaceFirebase(
            builder.appComponent);
    this.interactorCallsProvider =
        InteractorCalls_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorCallsProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideInterfaceInteractorCallsFactory.create(
                builder.serviceModule, interactorCallsProvider));
    this.interactorSmsProvider =
        InteractorSms_Factory.create(provideContextProvider, getInterfaceFirebaseProvider);
    this.provideInterfaceInteractorSmsProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideInterfaceInteractorSmsFactory.create(
                builder.serviceModule, interactorSmsProvider));
    this.serviceModule = builder.serviceModule;
    this.appComponent = builder.appComponent;
  }

  @Override
  public void inject(CallsService callsService) {
    injectCallsService(callsService);
  }

  @Override
  public void inject(SmsService smsService) {
    injectSmsService(smsService);
  }

  @Override
  public void inject(MonitorService monitorService) {
    injectMonitorService(monitorService);
  }

  @CanIgnoreReturnValue
  private CallsService injectCallsService(CallsService instance) {
    CallsService_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorCallsProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private SmsService injectSmsService(SmsService instance) {
    SmsService_MembersInjector.injectInteractor(
        instance, provideInterfaceInteractorSmsProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private MonitorService injectMonitorService(MonitorService instance) {
    MonitorService_MembersInjector.injectInteractor(instance, getInteractorMonitorService());
    return instance;
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private AppComponent appComponent;

    private Builder() {}

    public ServiceComponent build() {
      if (serviceModule == null) {
        throw new IllegalStateException(ServiceModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerServiceComponent(this);
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_github_midros_istheapp_di_component_AppComponent_getInterfaceFirebase
      implements Provider<InterfaceFirebase> {
    private final AppComponent appComponent;

    com_github_midros_istheapp_di_component_AppComponent_getInterfaceFirebase(
        AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public InterfaceFirebase get() {
      return Preconditions.checkNotNull(
          appComponent.getInterfaceFirebase(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
