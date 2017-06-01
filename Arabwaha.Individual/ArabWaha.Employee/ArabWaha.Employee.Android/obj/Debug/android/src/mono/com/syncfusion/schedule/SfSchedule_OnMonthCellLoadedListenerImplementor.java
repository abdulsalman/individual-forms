package mono.com.syncfusion.schedule;


public class SfSchedule_OnMonthCellLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.OnMonthCellLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnMonthCellLoaded:(Lcom/syncfusion/schedule/MonthCellLoadedArgs;)V:GetOnMonthCellLoaded_Lcom_syncfusion_schedule_MonthCellLoadedArgs_Handler:Com.Syncfusion.Schedule.SfSchedule/IOnMonthCellLoadedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IOnMonthCellLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_OnMonthCellLoadedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_OnMonthCellLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_OnMonthCellLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IOnMonthCellLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void OnMonthCellLoaded (com.syncfusion.schedule.MonthCellLoadedArgs p0)
	{
		n_OnMonthCellLoaded (p0);
	}

	private native void n_OnMonthCellLoaded (com.syncfusion.schedule.MonthCellLoadedArgs p0);

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
