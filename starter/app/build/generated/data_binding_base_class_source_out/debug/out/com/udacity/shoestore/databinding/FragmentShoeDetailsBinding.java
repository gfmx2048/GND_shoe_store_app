// Generated by data binding compiler. Do not edit!
package com.udacity.shoestore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.udacity.shoestore.R;
import com.udacity.shoestore.viewmodels.MainActivityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentShoeDetailsBinding extends ViewDataBinding {
  @NonNull
  public final Button btSdCancel;

  @NonNull
  public final Button btSdCreate;

  @NonNull
  public final EditText etSdCompany;

  @NonNull
  public final EditText etSdDescription;

  @NonNull
  public final EditText etSdName;

  @NonNull
  public final EditText etSdSize;

  @NonNull
  public final TextView tvSdCompany;

  @NonNull
  public final TextView tvSdDescription;

  @NonNull
  public final TextView tvSdName;

  @NonNull
  public final TextView tvSdSize;

  @Bindable
  protected MainActivityViewModel mViewModel;

  protected FragmentShoeDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btSdCancel, Button btSdCreate, EditText etSdCompany, EditText etSdDescription,
      EditText etSdName, EditText etSdSize, TextView tvSdCompany, TextView tvSdDescription,
      TextView tvSdName, TextView tvSdSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btSdCancel = btSdCancel;
    this.btSdCreate = btSdCreate;
    this.etSdCompany = etSdCompany;
    this.etSdDescription = etSdDescription;
    this.etSdName = etSdName;
    this.etSdSize = etSdSize;
    this.tvSdCompany = tvSdCompany;
    this.tvSdDescription = tvSdDescription;
    this.tvSdName = tvSdName;
    this.tvSdSize = tvSdSize;
  }

  public abstract void setViewModel(@Nullable MainActivityViewModel viewModel);

  @Nullable
  public MainActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentShoeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShoeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentShoeDetailsBinding>inflateInternal(inflater, R.layout.fragment_shoe_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentShoeDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShoeDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentShoeDetailsBinding>inflateInternal(inflater, R.layout.fragment_shoe_details, null, false, component);
  }

  public static FragmentShoeDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentShoeDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentShoeDetailsBinding)bind(component, view, R.layout.fragment_shoe_details);
  }
}
