package mono.com.syncfusion.schedule;


public class SfSchedule_visibleDatesChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.visibleDatesChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVisibleDatesChanged:(Ljava/lang/Object;Ljava/util/ArrayList;)V:GetOnVisibleDatesChanged_Ljava_lang_Object_Ljava_util_ArrayList_Handler:Com.Syncfusion.Schedule.SfSchedule/IVisibleDatesChangedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IVisibleDatesChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_visibleDatesChangedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_visibleDatesChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_visibleDatesChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IVisibleDatesChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onVisibleDatesChanged (java.lang.Object p0, java.util.ArrayList p1)
	{
		n_onVisibleDatesChanged (p0, p1);
	}

	private native void n_onVisibleDatesChanged (java.lang.Object p0, java.util.ArrayList p1);

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
