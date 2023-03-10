// Generated by view binder compiler. Do not edit!
package android.example.hoysalaelectronics.databinding;

import android.example.hoysalaelectronics.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputLayout TIGmail;

  @NonNull
  public final TextInputLayout TIPassword;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final ImageView ivGoggleIcon;

  @NonNull
  public final View line;

  @NonNull
  public final RelativeLayout rlNewuser;

  @NonNull
  public final TextView tvBack;

  @NonNull
  public final TextView tvForgetpassword;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final TextView tvNewuser;

  @NonNull
  public final TextView tvRegister;

  @NonNull
  public final TextView tvWelcome;

  private ActivityLoginBinding(@NonNull ScrollView rootView, @NonNull TextInputLayout TIGmail,
      @NonNull TextInputLayout TIPassword, @NonNull Button btnLogin,
      @NonNull ImageView ivGoggleIcon, @NonNull View line, @NonNull RelativeLayout rlNewuser,
      @NonNull TextView tvBack, @NonNull TextView tvForgetpassword, @NonNull TextView tvLogin,
      @NonNull TextView tvNewuser, @NonNull TextView tvRegister, @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.TIGmail = TIGmail;
    this.TIPassword = TIPassword;
    this.btnLogin = btnLogin;
    this.ivGoggleIcon = ivGoggleIcon;
    this.line = line;
    this.rlNewuser = rlNewuser;
    this.tvBack = tvBack;
    this.tvForgetpassword = tvForgetpassword;
    this.tvLogin = tvLogin;
    this.tvNewuser = tvNewuser;
    this.tvRegister = tvRegister;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TI_gmail;
      TextInputLayout TIGmail = ViewBindings.findChildViewById(rootView, id);
      if (TIGmail == null) {
        break missingId;
      }

      id = R.id.TI_Password;
      TextInputLayout TIPassword = ViewBindings.findChildViewById(rootView, id);
      if (TIPassword == null) {
        break missingId;
      }

      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.iv_goggle_icon;
      ImageView ivGoggleIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivGoggleIcon == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.rl_newuser;
      RelativeLayout rlNewuser = ViewBindings.findChildViewById(rootView, id);
      if (rlNewuser == null) {
        break missingId;
      }

      id = R.id.tv_back;
      TextView tvBack = ViewBindings.findChildViewById(rootView, id);
      if (tvBack == null) {
        break missingId;
      }

      id = R.id.tv_forgetpassword;
      TextView tvForgetpassword = ViewBindings.findChildViewById(rootView, id);
      if (tvForgetpassword == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.tv_newuser;
      TextView tvNewuser = ViewBindings.findChildViewById(rootView, id);
      if (tvNewuser == null) {
        break missingId;
      }

      id = R.id.tv_register;
      TextView tvRegister = ViewBindings.findChildViewById(rootView, id);
      if (tvRegister == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      TextView tvWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ScrollView) rootView, TIGmail, TIPassword, btnLogin,
          ivGoggleIcon, line, rlNewuser, tvBack, tvForgetpassword, tvLogin, tvNewuser, tvRegister,
          tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
