package mono.com.syncfusion.schedule;


public class CustomHorizontalViewScroller_OnScrollStoppedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.CustomHorizontalViewScroller.OnScrollStoppedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollStopped:()V:GetOnScrollStoppedHandler:Com.Syncfusion.Schedule.CustomHorizontalViewScroller/IOnScrollStoppedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.CustomHorizontalViewScroller+IOnScrollStoppedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", CustomHorizontalViewScroller_OnScrollStoppedListenerImplementor.class, __md_methods);
	}


	public CustomHorizontalViewScroller_OnScrollStoppedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomHorizontalViewScroller_OnScrollStoppedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.CustomHorizontalViewScroller+IOnScrollStoppedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onScrollStopped ()
	{
		n_onScrollStopped ();
	}

	private native void n_onScrollStopped ();

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
