package mono;

import java.io.*;
import java.lang.String;
import java.util.Locale;
import java.util.HashSet;
import java.util.zip.*;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.util.Log;
import mono.android.Runtime;

public class MonoPackageManager {

	static Object lock = new Object ();
	static boolean initialized;

	static android.content.Context Context;

	public static void LoadApplication (Context context, ApplicationInfo runtimePackage, String[] apks)
	{
		synchronized (lock) {
			if (context instanceof android.app.Application) {
				Context = context;
			}
			if (!initialized) {
				android.content.IntentFilter timezoneChangedFilter  = new android.content.IntentFilter (
						android.content.Intent.ACTION_TIMEZONE_CHANGED
				);
				context.registerReceiver (new mono.android.app.NotifyTimeZoneChanges (), timezoneChangedFilter);
				
				System.loadLibrary("monodroid");
				Locale locale       = Locale.getDefault ();
				String language     = locale.getLanguage () + "-" + locale.getCountry ();
				String filesDir     = context.getFilesDir ().getAbsolutePath ();
				String cacheDir     = context.getCacheDir ().getAbsolutePath ();
				String dataDir      = getNativeLibraryPath (context);
				ClassLoader loader  = context.getClassLoader ();

				Runtime.init (
						language,
						apks,
						getNativeLibraryPath (runtimePackage),
						new String[]{
							filesDir,
							cacheDir,
							dataDir,
						},
						loader,
						new java.io.File (
							android.os.Environment.getExternalStorageDirectory (),
							"Android/data/" + context.getPackageName () + "/files/.__override__").getAbsolutePath (),
						MonoPackageManager_Resources.Assemblies,
						context.getPackageName ());
				
				mono.android.app.ApplicationRegistration.registerApplications ();
				
				initialized = true;
			}
		}
	}

	public static void setContext (Context context)
	{
		// Ignore; vestigial
	}

	static String getNativeLibraryPath (Context context)
	{
	    return getNativeLibraryPath (context.getApplicationInfo ());
	}

	static String getNativeLibraryPath (ApplicationInfo ainfo)
	{
		if (android.os.Build.VERSION.SDK_INT >= 9)
			return ainfo.nativeLibraryDir;
		return ainfo.dataDir + "/lib";
	}

	public static String[] getAssemblies ()
	{
		return MonoPackageManager_Resources.Assemblies;
	}

	public static String[] getDependencies ()
	{
		return MonoPackageManager_Resources.Dependencies;
	}

	public static String getApiPackageName ()
	{
		return MonoPackageManager_Resources.ApiPackageName;
	}
}

class MonoPackageManager_Resources {
	public static final String[] Assemblies = new String[]{
		/* We need to ensure that "ArabWaha.Employee.Android.dll" comes first in this list. */
		"ArabWaha.Employee.Android.dll",
		"ArabWaha.Common.Droid.dll",
		"ArabWaha.Core.dll",
		"ArabWaha.Employee.dll",
		"CarouselView.FormsPlugin.Abstractions.dll",
		"CarouselView.FormsPlugin.Android.dll",
		"FormsViewGroup.dll",
		"HockeySDK.AndroidBindings.dll",
		"HockeySDK.dll",
		"Microsoft.Practices.ServiceLocation.dll",
		"Microsoft.Practices.Unity.dll",
		"Prism.dll",
		"Prism.Forms.dll",
		"Prism.Unity.Forms.dll",
		"SlideOverKit.dll",
		"SlideOverKit.Droid.dll",
		"SQLite-net.dll",
		"SQLitePCLRaw.batteries_green.dll",
		"SQLitePCLRaw.batteries_v2.dll",
		"SQLitePCLRaw.core.dll",
		"SQLitePCLRaw.lib.e_sqlite3.dll",
		"SQLitePCLRaw.provider.e_sqlite3.dll",
		"Syncfusion.DataSource.Portable.dll",
		"Syncfusion.GridCommon.Portable.dll",
		"Syncfusion.SfAutoComplete.Android.dll",
		"Syncfusion.SfAutoComplete.XForms.Android.dll",
		"Syncfusion.SfAutoComplete.XForms.dll",
		"Syncfusion.SfBusyIndicator.Android.dll",
		"Syncfusion.SfBusyIndicator.XForms.Android.dll",
		"Syncfusion.SfBusyIndicator.XForms.dll",
		"Syncfusion.SfListView.XForms.Android.dll",
		"Syncfusion.SfListView.XForms.dll",
		"Syncfusion.SfRotator.Android.dll",
		"Syncfusion.SfRotator.XForms.Android.dll",
		"Syncfusion.SfRotator.XForms.dll",
		"Syncfusion.SfSchedule.Android.dll",
		"Syncfusion.SfSchedule.XForms.Android.dll",
		"Syncfusion.SfSchedule.XForms.dll",
		"Xamarin.Android.Support.Animated.Vector.Drawable.dll",
		"Xamarin.Android.Support.Compat.dll",
		"Xamarin.Android.Support.Core.UI.dll",
		"Xamarin.Android.Support.Core.Utils.dll",
		"Xamarin.Android.Support.Design.dll",
		"Xamarin.Android.Support.Fragment.dll",
		"Xamarin.Android.Support.Media.Compat.dll",
		"Xamarin.Android.Support.v4.dll",
		"Xamarin.Android.Support.v7.AppCompat.dll",
		"Xamarin.Android.Support.v7.CardView.dll",
		"Xamarin.Android.Support.v7.MediaRouter.dll",
		"Xamarin.Android.Support.v7.Palette.dll",
		"Xamarin.Android.Support.v7.RecyclerView.dll",
		"Xamarin.Android.Support.Vector.Drawable.dll",
		"Xamarin.Forms.Core.dll",
		"Xamarin.Forms.Maps.Android.dll",
		"Xamarin.Forms.Maps.dll",
		"Xamarin.Forms.Platform.Android.dll",
		"Xamarin.Forms.Platform.dll",
		"Xamarin.Forms.Xaml.dll",
		"Xamarin.GooglePlayServices.Base.dll",
		"Xamarin.GooglePlayServices.Basement.dll",
		"Xamarin.GooglePlayServices.Maps.dll",
		"ArabWaha.Common.Forms.dll",
		"Newtonsoft.Json.dll",
		"FubarCoder.RestSharp.Portable.HttpClient.dll",
		"FubarCoder.RestSharp.Portable.Core.dll",
		"System.Net.Http.Primitives.dll",
		"Plugin.Settings.Abstractions.dll",
		"Plugin.Settings.dll",
		"Pillar.dll",
		"Pillar.Ioc.dll",
	};
	public static final String[] Dependencies = new String[]{
	};
	public static final String ApiPackageName = "Mono.Android.Platform.ApiLevel_25";
}