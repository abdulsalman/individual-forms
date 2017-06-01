package mono.com.syncfusion.schedule;


public class MonthViewSettings_inlineTappedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.MonthViewSettings.inlineTappedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInlineTapped:(Lcom/syncfusion/schedule/InlineItem;)V:GetOnInlineTapped_Lcom_syncfusion_schedule_InlineItem_Handler:Com.Syncfusion.Schedule.MonthViewSettings/IInlineTappedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.MonthViewSettings+IInlineTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", MonthViewSettings_inlineTappedListenerImplementor.class, __md_methods);
	}


	public MonthViewSettings_inlineTappedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MonthViewSettings_inlineTappedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.MonthViewSettings+IInlineTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onInlineTapped (com.syncfusion.schedule.InlineItem p0)
	{
		n_onInlineTapped (p0);
	}

	private native void n_onInlineTapped (com.syncfusion.schedule.InlineItem p0);

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
