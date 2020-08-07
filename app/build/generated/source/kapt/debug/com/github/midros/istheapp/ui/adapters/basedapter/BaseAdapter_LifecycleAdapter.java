package com.github.midros.istheapp.ui.adapters.basedapter;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;
import javax.annotation.Generated;

@Generated("androidx.lifecycle.LifecycleProcessor")
public class BaseAdapter_LifecycleAdapter implements GeneratedAdapter {
  final BaseAdapter mReceiver;

  BaseAdapter_LifecycleAdapter(BaseAdapter receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("startListening", 1)) {
        mReceiver.startListening();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("stopListening", 1)) {
        mReceiver.stopListening();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_DESTROY) {
      if (!hasLogger || logger.approveCall("cleanup", 2)) {
        mReceiver.cleanup(owner);
      }
      return;
    }
  }
}
