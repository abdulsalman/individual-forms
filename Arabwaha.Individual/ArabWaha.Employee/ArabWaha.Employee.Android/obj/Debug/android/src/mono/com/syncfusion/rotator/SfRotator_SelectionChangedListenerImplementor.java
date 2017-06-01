package mono.com.syncfusion.rotator;


public class SfRotator_SelectionChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.rotator.SfRotator.SelectionChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_SelectionChanged:(Ljava/lang/Object;Ljava/lang/Object;)V:GetSelectionChanged_Ljava_lang_Object_Ljava_lang_Object_Handler:Com.Syncfusion.Rotator.SfRotator/ISelectionChangedListenerInvoker, Syncfusion.SfRotator.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Rotator.SfRotator+ISelectionChangedListenerImplementor, Syncfusion.SfRotator.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfRotator_SelectionChangedListenerImplementor.class, __md_methods);
	}


	public SfRotator_SelectionChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfRotator_SelectionChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Rotator.SfRotator+ISelectionChangedListenerImplementor, Syncfusion.SfRotator.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void SelectionChanged (java.lang.Object p0, java.lang.Object p1)
	{
		n_SelectionChanged (p0, p1);
	}

	private native void n_SelectionChanged (java.lang.Object p0, java.lang.Object p1);

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
