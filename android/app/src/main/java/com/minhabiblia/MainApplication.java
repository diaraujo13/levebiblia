package com.minhabiblia;

import android.app.Application;

import com.facebook.react.ReactApplication;
import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import cl.json.RNSharePackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import org.pgsqlite.SQLitePluginPackage;

import java.util.Arrays;
import java.util.List;
import cl.json.ShareApplication;

import com.reactnativenavigation.NavigationApplication;


public class MainApplication extends  NavigationApplication implements ShareApplication{

    @Override
    public boolean isDebug() {
        // Make sure you are using BuildConfig from your own application
        return BuildConfig.DEBUG;
    }

    protected List<ReactPackage> getPackages() {
         // Add additional packages you require here
         // No need to add RnnPackage and MainReactPackage
         return Arrays.<ReactPackage>asList(
             new VectorIconsPackage(),
             new SQLitePluginPackage(),
             new RNSharePackage(),
             new RNViewShotPackage()
         );
    }

    @Override
     public List<ReactPackage> createAdditionalReactPackages() {
         return getPackages();
    }

    @Override
    public String getJSMainModuleName() {
        return "index";
    }

     @Override
     public String getFileProviderAuthority() {
            return "com.minhabiblia.provider";
     }
}
