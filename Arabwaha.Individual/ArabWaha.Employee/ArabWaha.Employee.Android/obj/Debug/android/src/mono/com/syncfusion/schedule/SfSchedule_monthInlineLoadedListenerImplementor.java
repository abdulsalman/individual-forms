package mono.com.syncfusion.schedule;


public class SfSchedule_monthInlineLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.monthInlineLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMonthInlineLoaded:(Lcom/syncfusion/schedule/MonthInlineLoadedArgs;)V:GetOnMonthInlineLoaded_Lcom_syncfusion_schedule_MonthInlineLoadedArgs_Handler:Com.Syncfusion.Schedule.SfSchedule/IMonthInlineLoadedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IMonthInlineLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_monthInlineLoadedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_monthInlineLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_monthInlineLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IMonthInlineLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMonthInlineLoaded (com.syncfusion.schedule.MonthInlineLoadedArgs p0)
	{
		n_onMonthInlineLoaded (p0);
	}

	private native void n_onMonthInlineLoaded (com.syncfusion.schedule.MonthInlineLoadedArgs p0);

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
