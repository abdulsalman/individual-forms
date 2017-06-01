package md5af3732892702b6c71b8c64ce98138794;


public class CustomRotatorAdapter
	extends com.syncfusion.rotator.RotatorAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemView:(Lcom/syncfusion/rotator/SfRotator;I)Landroid/view/View;:GetGetItemView_Lcom_syncfusion_rotator_SfRotator_IHandler\n" +
			"n_getThumbnailView:(Lcom/syncfusion/rotator/SfRotator;I)Landroid/view/View;:GetGetThumbnailView_Lcom_syncfusion_rotator_SfRotator_IHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfRotator.XForms.Droid.CustomRotatorAdapter, Syncfusion.SfRotator.XForms.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", CustomRotatorAdapter.class, __md_methods);
	}


	public CustomRotatorAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomRotatorAdapter.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfRotator.XForms.Droid.CustomRotatorAdapter, Syncfusion.SfRotator.XForms.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public android.view.View getItemView (com.syncfusion.rotator.SfRotator p0, int p1)
	{
		return n_getItemView (p0, p1);
	}

	private native android.view.View n_getItemView (com.syncfusion.rotator.SfRotator p0, int p1);


	public android.view.View getThumbnailView (com.syncfusion.rotator.SfRotator p0, int p1)
	{
		return n_getThumbnailView (p0, p1);
	}

	private native android.view.View n_getThumbnailView (com.syncfusion.rotator.SfRotator p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
