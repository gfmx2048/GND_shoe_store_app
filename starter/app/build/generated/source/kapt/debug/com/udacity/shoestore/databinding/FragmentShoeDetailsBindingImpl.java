package com.udacity.shoestore.databinding;
import com.udacity.shoestore.R;
import com.udacity.shoestore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShoeDetailsBindingImpl extends FragmentShoeDetailsBinding implements com.udacity.shoestore.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_sd_name, 7);
        sViewsWithIds.put(R.id.tv_sd_company, 8);
        sViewsWithIds.put(R.id.tv_sd_description, 9);
        sViewsWithIds.put(R.id.tv_sd_size, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etSdCompanyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.newShoe.company
            //         is viewModel.newShoe.setCompany((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSdCompany);
            // localize variables for thread safety
            // viewModel.newShoe != null
            boolean viewModelNewShoeJavaLangObjectNull = false;
            // viewModel.newShoe.company
            java.lang.String viewModelNewShoeCompany = null;
            // viewModel
            com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
            // viewModel.newShoe
            com.udacity.shoestore.models.Shoe viewModelNewShoe = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNewShoe = viewModel.getNewShoe();

                viewModelNewShoeJavaLangObjectNull = (viewModelNewShoe) != (null);
                if (viewModelNewShoeJavaLangObjectNull) {




                    viewModelNewShoe.setCompany(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSdDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.newShoe.description
            //         is viewModel.newShoe.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSdDescription);
            // localize variables for thread safety
            // viewModel.newShoe != null
            boolean viewModelNewShoeJavaLangObjectNull = false;
            // viewModel
            com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
            // viewModel.newShoe
            com.udacity.shoestore.models.Shoe viewModelNewShoe = null;
            // viewModel.newShoe.description
            java.lang.String viewModelNewShoeDescription = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNewShoe = viewModel.getNewShoe();

                viewModelNewShoeJavaLangObjectNull = (viewModelNewShoe) != (null);
                if (viewModelNewShoeJavaLangObjectNull) {




                    viewModelNewShoe.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSdNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.newShoe.name
            //         is viewModel.newShoe.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSdName);
            // localize variables for thread safety
            // viewModel.newShoe.name
            java.lang.String viewModelNewShoeName = null;
            // viewModel.newShoe != null
            boolean viewModelNewShoeJavaLangObjectNull = false;
            // viewModel
            com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
            // viewModel.newShoe
            com.udacity.shoestore.models.Shoe viewModelNewShoe = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNewShoe = viewModel.getNewShoe();

                viewModelNewShoeJavaLangObjectNull = (viewModelNewShoe) != (null);
                if (viewModelNewShoeJavaLangObjectNull) {




                    viewModelNewShoe.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etSdSizeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ("") + (viewModel.newShoe.size)
            //         is viewModel.newShoe.setSize((double) androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModel.newShoe.size))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSdSize);
            // localize variables for thread safety
            // ("") + (viewModel.newShoe.size)
            java.lang.String javaLangStringViewModelNewShoeSize = null;
            // (double) androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModel.newShoe.size)
            double doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize = 0.0;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.newShoe != null
            boolean viewModelNewShoeJavaLangObjectNull = false;
            // androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModel.newShoe.size)
            double androidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize = 0.0;
            // viewModel
            com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
            // viewModel.newShoe
            com.udacity.shoestore.models.Shoe viewModelNewShoe = null;
            // viewModel.newShoe.size
            double viewModelNewShoeSize = 0.0;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNewShoe = viewModel.getNewShoe();

                viewModelNewShoeJavaLangObjectNull = (viewModelNewShoe) != (null);
                if (viewModelNewShoeJavaLangObjectNull) {






                    viewModelNewShoeSize = viewModelNewShoe.getSize();

                    androidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize = androidx.databinding.ViewDataBinding.parse(callbackArg_0, viewModelNewShoeSize);

                    doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize = ((double) (androidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize));

                    viewModelNewShoe.setSize(doubleAndroidxDatabindingViewDataBindingParseCallbackArg0ViewModelNewShoeSize);
                }
            }
        }
    };

    public FragmentShoeDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentShoeDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            );
        this.btSdCancel.setTag(null);
        this.btSdCreate.setTag(null);
        this.etSdCompany.setTag(null);
        this.etSdDescription.setTag(null);
        this.etSdName.setTag(null);
        this.etSdSize.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.udacity.shoestore.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.udacity.shoestore.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.udacity.shoestore.viewmodels.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.udacity.shoestore.viewmodels.MainActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String javaLangStringViewModelNewShoeSize = null;
        java.lang.String viewModelNewShoeName = null;
        java.lang.String viewModelNewShoeCompany = null;
        com.udacity.shoestore.models.Shoe viewModelNewShoe = null;
        double viewModelNewShoeSize = 0.0;
        java.lang.String viewModelNewShoeDescription = null;
        com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.newShoe
                    viewModelNewShoe = viewModel.getNewShoe();
                }


                if (viewModelNewShoe != null) {
                    // read viewModel.newShoe.name
                    viewModelNewShoeName = viewModelNewShoe.getName();
                    // read viewModel.newShoe.company
                    viewModelNewShoeCompany = viewModelNewShoe.getCompany();
                    // read viewModel.newShoe.size
                    viewModelNewShoeSize = viewModelNewShoe.getSize();
                    // read viewModel.newShoe.description
                    viewModelNewShoeDescription = viewModelNewShoe.getDescription();
                }


                // read ("") + (viewModel.newShoe.size)
                javaLangStringViewModelNewShoeSize = ("") + (viewModelNewShoeSize);
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btSdCancel.setOnClickListener(mCallback4);
            this.btSdCreate.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSdCompany, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSdCompanyandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSdDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSdDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSdName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSdNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSdSize, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSdSizeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSdCompany, viewModelNewShoeCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSdDescription, viewModelNewShoeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSdName, viewModelNewShoeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSdSize, javaLangStringViewModelNewShoeSize);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.close();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.udacity.shoestore.viewmodels.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.saveShoe();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}